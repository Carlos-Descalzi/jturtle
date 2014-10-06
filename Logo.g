grammar Logo;


options {
	k=2;
}


@lexer::header {
package logo.parser;
}

@parser::header {
package logo.parser;

import logo.expressions.*;
}

@members {
	logo.ui.Context context;
	IterationHandler handler = new IterationHandler();
	public void setContext(logo.ui.Context context){
		this.context = context;
	}
}


program	:	(function|statement)+;

function 
	:	
		{
			List<Statement> statements = new ArrayList<Statement>();
			List<String> variables = new ArrayList<String>();
		}
		TO f=ID ( v=varref { variables.add($v.value.getVarName());})* EOL
		(singleLine{statements.add($singleLine.value);})+ 
		END { context.addFunction(new UserFunction($f.text,variables, statements));}
		EOL? 
	;

statement
	:	singleLine		{$singleLine.value.execute(context);}
	;
	
singleLine returns [Statement value]
	:
		{ List<Sentence> sentences = new ArrayList<Sentence>();}
		s1=sentence { sentences.add($s1.value);} 
		(':' s2=sentence { sentences.add($s2.value);} )* 	
		EOL { $value = new Statement(sentences); }
	;
	
sentence returns [Sentence value]
	:	repeat			{ $value = $repeat.value; }
	|	ifExp			{ $value = $ifExp.value; }
	|	assignment		{ $value = $assignment.value; }
	|	call			{ $value = $call.value; }
	;
	
call	returns [Sentence value]
	:					{ java.util.List<Expression> arguments = new java.util.ArrayList<Expression>();}
		ID (expression {arguments.add($expression.value);})* 		
						{ $value = new Call($ID.text,arguments);};

block	returns [Block value]
	:	{ 
			List<Sentence> sentences = new ArrayList<Sentence>();
			List<String> variables = new ArrayList<String>();
		}
		OPEN_BR (EOL)? ((COLON v=ID {variables.add($v.text);})* (EOL))?
			s1=sentence {sentences.add($s1.value);} 
		((','|EOL) s2=sentence {sentences.add($s2.value);})* (EOL)? 
		CLOSE_BR 			{ $value = new Block(variables,sentences); };

repeat	returns [Sentence value]
	:	REPEAT expression block		{ $value = new Repeat($expression.value,$block.value);};

ifExp	returns [Sentence value]
	:	IF expression block		{ $value = new IfExp($expression.value,$block.value);};

assignment returns [Sentence value]					
	:	MAKE ID expression 		{ $value = new Assignment($ID.text,$expression.value);}
	;
	
expression returns [Expression value]
	:	logical				{ $value = $logical.value;}
	;

logical returns [Expression value]
	:	{ LogicalOperation operation = new LogicalOperation();}
		o1=comp 			{ operation.and($o1.value);}
		(
		  AND o2=comp			{ operation.and($o2.value);}
		| OR o2=comp			{ operation.and($o2.value);}
		| XOR o2=comp			{ operation.and($o2.value);}
		)*				{ $value = operation;}
	;

comp returns [Expression value]
	:	{ ComparativeOperation operation = new ComparativeOperation();}
		o1=sum				{ operation.eq($o1.value);}
		(
		  LT o2=sum			{ operation.lt($o2.value);}
		| LE o2=sum			{ operation.le($o2.value);}
		| NE o2=sum			{ operation.ne($o2.value);}
		| GT o2=sum			{ operation.gt($o2.value);}
		| GE o2=sum			{ operation.le($o2.value);}
		| EQ o2=sum			{ operation.eq($o2.value);}
		)*				{ $value=operation;}
	;

sum returns [Expression value]
	:	{ AdditiveOperation operation = new AdditiveOperation(); }
		o1=mult 			{ operation.sum($o1.value);}
		(
		  PLUS o2=mult 			{ operation.sum($o2.value);}
		| MINUS o2=mult 		{ operation.sub($o2.value);}
		)*				{ $value = operation;}
	;

mult returns [Expression value]
	:	{ ProductOperation operation = new ProductOperation();}
		o1=atom 			{ operation.mult($o1.value);}
		(
		  MULT o2=atom			{ operation.mult($o2.value);}
		| DIV o2=atom			{ operation.div($o2.value);}
		)*				{ $value = operation;}
	;

array returns [Expression value]
	:
		{ ArrayLiteral array = new ArrayLiteral();}	
		('{'! 
			e1=expression { array.add($e1.value.evaluate(context)); }
			(',' e2=expression { array.add($e2.value.evaluate(context)); })*
		'}'!)
						{ $value = array; }	
/*	|	{ Dictionary dict = new Dictionary();}
		('{'! COLON id1=ID  e1=expression	{dict.put($id1.text,$e1.value.evaluate(context));}
			(',' COLON id2=ID e2=expression
						{dict.put($id2.text,$e2.value.evaluate(context));}
			)*
		'}'!)
						{ $value = dict;}*/
	;

atom returns [Expression value]
	:	varref				{ $value = $varref.value; }
	|	INT				{ $value = new Literal(Integer.valueOf($INT.text)); }
	|	FLOAT				{ $value = new Literal(Float.valueOf($FLOAT.text)); }
	|	STRING				{ $value = new Literal($STRING.text.substring(1,$STRING.text.length()-1));}
	|	array				{ $value = $array.value;}
	|	(OPEN_PAR! expression CLOSE_PAR!)		
						{ $value = $expression.value;}
	|	call				{ $value = $call.value;}
	;

varref returns [VarRef value]
	:	COLON ID			{ $value = new VarRef($ID.text);}
	;

COLON
	:	':';

SEMICOLON
	:	';';

OR	:	'or';

AND	:	'and';

XOR	:	'xor';

IF	:	'if';

MAKE	:	'make';

REPEAT	:	'repeat';

END	:	'end';

DQUOTE	:	'"';

TO	:	'to';

ID	:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    	;

INT	:	'0'..'9'+
    	;

FLOAT	:	'0'..'9'+  '.' '0'..'9'+ 
	;

WS	:   	( ' '| '\t') {$channel=HIDDEN;}
    	;

EOL	:	('\n'|'\r')+;

STRING
    	:  	'\'' (~('\\'|'\'') )* '\''
    	;

COMMA	:	',';

OPEN_PAR:	'(';
CLOSE_PAR
	:	')';
OPEN_BR	:	'[';
CLOSE_BR:	']';
LT	:	'<';
GT	:	'>';
LE	:	'<=';
GE	:	'>=';
EQ	:	'=';
NE	:	'<>';
MULT	:	'*';
DIV	:	'/';
PLUS	:	'+';
MINUS	:	'-';
