// $ANTLR 3.4 /home/carlos/Proyectos/logojava/Logo.g 2012-11-18 18:28:14

package logo.parser;

import logo.expressions.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class LogoParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "CLOSE_BR", "CLOSE_PAR", "COLON", "COMMA", "DIV", "DQUOTE", "END", "EOL", "EQ", "FLOAT", "GE", "GT", "ID", "IF", "INT", "LE", "LT", "MAKE", "MINUS", "MULT", "NE", "OPEN_BR", "OPEN_PAR", "OR", "PLUS", "REPEAT", "SEMICOLON", "STRING", "TO", "WS", "XOR", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int AND=4;
    public static final int CLOSE_BR=5;
    public static final int CLOSE_PAR=6;
    public static final int COLON=7;
    public static final int COMMA=8;
    public static final int DIV=9;
    public static final int DQUOTE=10;
    public static final int END=11;
    public static final int EOL=12;
    public static final int EQ=13;
    public static final int FLOAT=14;
    public static final int GE=15;
    public static final int GT=16;
    public static final int ID=17;
    public static final int IF=18;
    public static final int INT=19;
    public static final int LE=20;
    public static final int LT=21;
    public static final int MAKE=22;
    public static final int MINUS=23;
    public static final int MULT=24;
    public static final int NE=25;
    public static final int OPEN_BR=26;
    public static final int OPEN_PAR=27;
    public static final int OR=28;
    public static final int PLUS=29;
    public static final int REPEAT=30;
    public static final int SEMICOLON=31;
    public static final int STRING=32;
    public static final int TO=33;
    public static final int WS=34;
    public static final int XOR=35;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public LogoParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public LogoParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return LogoParser.tokenNames; }
    public String getGrammarFileName() { return "/home/carlos/Proyectos/logojava/Logo.g"; }


    	logo.ui.Context context;
    	IterationHandler handler = new IterationHandler();
    	public void setContext(logo.ui.Context context){
    		this.context = context;
    	}


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // /home/carlos/Proyectos/logojava/Logo.g:28:1: program : ( function | statement )+ ;
    public final LogoParser.program_return program() throws RecognitionException {
        LogoParser.program_return retval = new LogoParser.program_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        LogoParser.function_return function1 =null;

        LogoParser.statement_return statement2 =null;



        try {
            // /home/carlos/Proyectos/logojava/Logo.g:28:9: ( ( function | statement )+ )
            // /home/carlos/Proyectos/logojava/Logo.g:28:11: ( function | statement )+
            {
            root_0 = (Object)adaptor.nil();


            // /home/carlos/Proyectos/logojava/Logo.g:28:11: ( function | statement )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==TO) ) {
                    alt1=1;
                }
                else if ( ((LA1_0 >= ID && LA1_0 <= IF)||LA1_0==MAKE||LA1_0==REPEAT) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/carlos/Proyectos/logojava/Logo.g:28:12: function
            	    {
            	    pushFollow(FOLLOW_function_in_program49);
            	    function1=function();

            	    state._fsp--;

            	    adaptor.addChild(root_0, function1.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/carlos/Proyectos/logojava/Logo.g:28:21: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_program51);
            	    statement2=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement2.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "program"


    public static class function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function"
    // /home/carlos/Proyectos/logojava/Logo.g:30:1: function : TO f= ID (v= varref )* EOL ( singleLine )+ END ( EOL )? ;
    public final LogoParser.function_return function() throws RecognitionException {
        LogoParser.function_return retval = new LogoParser.function_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token f=null;
        Token TO3=null;
        Token EOL4=null;
        Token END6=null;
        Token EOL7=null;
        LogoParser.varref_return v =null;

        LogoParser.singleLine_return singleLine5 =null;


        Object f_tree=null;
        Object TO3_tree=null;
        Object EOL4_tree=null;
        Object END6_tree=null;
        Object EOL7_tree=null;

        try {
            // /home/carlos/Proyectos/logojava/Logo.g:31:2: ( TO f= ID (v= varref )* EOL ( singleLine )+ END ( EOL )? )
            // /home/carlos/Proyectos/logojava/Logo.g:32:3: TO f= ID (v= varref )* EOL ( singleLine )+ END ( EOL )?
            {
            root_0 = (Object)adaptor.nil();



            			List<Statement> statements = new ArrayList<Statement>();
            			List<String> variables = new ArrayList<String>();
            		

            TO3=(Token)match(input,TO,FOLLOW_TO_in_function70); 
            TO3_tree = 
            (Object)adaptor.create(TO3)
            ;
            adaptor.addChild(root_0, TO3_tree);


            f=(Token)match(input,ID,FOLLOW_ID_in_function74); 
            f_tree = 
            (Object)adaptor.create(f)
            ;
            adaptor.addChild(root_0, f_tree);


            // /home/carlos/Proyectos/logojava/Logo.g:36:11: (v= varref )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==COLON) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/carlos/Proyectos/logojava/Logo.g:36:13: v= varref
            	    {
            	    pushFollow(FOLLOW_varref_in_function80);
            	    v=varref();

            	    state._fsp--;

            	    adaptor.addChild(root_0, v.getTree());

            	     variables.add((v!=null?v.value:null).getVarName());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            EOL4=(Token)match(input,EOL,FOLLOW_EOL_in_function86); 
            EOL4_tree = 
            (Object)adaptor.create(EOL4)
            ;
            adaptor.addChild(root_0, EOL4_tree);


            // /home/carlos/Proyectos/logojava/Logo.g:37:3: ( singleLine )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= ID && LA3_0 <= IF)||LA3_0==MAKE||LA3_0==REPEAT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/carlos/Proyectos/logojava/Logo.g:37:4: singleLine
            	    {
            	    pushFollow(FOLLOW_singleLine_in_function91);
            	    singleLine5=singleLine();

            	    state._fsp--;

            	    adaptor.addChild(root_0, singleLine5.getTree());

            	    statements.add((singleLine5!=null?singleLine5.value:null));

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            END6=(Token)match(input,END,FOLLOW_END_in_function99); 
            END6_tree = 
            (Object)adaptor.create(END6)
            ;
            adaptor.addChild(root_0, END6_tree);


             context.addFunction(new UserFunction((f!=null?f.getText():null),variables, statements));

            // /home/carlos/Proyectos/logojava/Logo.g:39:3: ( EOL )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EOL) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/carlos/Proyectos/logojava/Logo.g:39:3: EOL
                    {
                    EOL7=(Token)match(input,EOL,FOLLOW_EOL_in_function105); 
                    EOL7_tree = 
                    (Object)adaptor.create(EOL7)
                    ;
                    adaptor.addChild(root_0, EOL7_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function"


    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // /home/carlos/Proyectos/logojava/Logo.g:42:1: statement : singleLine ;
    public final LogoParser.statement_return statement() throws RecognitionException {
        LogoParser.statement_return retval = new LogoParser.statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        LogoParser.singleLine_return singleLine8 =null;



        try {
            // /home/carlos/Proyectos/logojava/Logo.g:43:2: ( singleLine )
            // /home/carlos/Proyectos/logojava/Logo.g:43:4: singleLine
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_singleLine_in_statement118);
            singleLine8=singleLine();

            state._fsp--;

            adaptor.addChild(root_0, singleLine8.getTree());

            (singleLine8!=null?singleLine8.value:null).execute(context);

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class singleLine_return extends ParserRuleReturnScope {
        public Statement value;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "singleLine"
    // /home/carlos/Proyectos/logojava/Logo.g:46:1: singleLine returns [Statement value] :s1= sentence ( ':' s2= sentence )* EOL ;
    public final LogoParser.singleLine_return singleLine() throws RecognitionException {
        LogoParser.singleLine_return retval = new LogoParser.singleLine_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal9=null;
        Token EOL10=null;
        LogoParser.sentence_return s1 =null;

        LogoParser.sentence_return s2 =null;


        Object char_literal9_tree=null;
        Object EOL10_tree=null;

        try {
            // /home/carlos/Proyectos/logojava/Logo.g:47:2: (s1= sentence ( ':' s2= sentence )* EOL )
            // /home/carlos/Proyectos/logojava/Logo.g:48:3: s1= sentence ( ':' s2= sentence )* EOL
            {
            root_0 = (Object)adaptor.nil();


             List<Sentence> sentences = new ArrayList<Sentence>();

            pushFollow(FOLLOW_sentence_in_singleLine145);
            s1=sentence();

            state._fsp--;

            adaptor.addChild(root_0, s1.getTree());

             sentences.add((s1!=null?s1.value:null));

            // /home/carlos/Proyectos/logojava/Logo.g:50:3: ( ':' s2= sentence )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COLON) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/carlos/Proyectos/logojava/Logo.g:50:4: ':' s2= sentence
            	    {
            	    char_literal9=(Token)match(input,COLON,FOLLOW_COLON_in_singleLine153); 
            	    char_literal9_tree = 
            	    (Object)adaptor.create(char_literal9)
            	    ;
            	    adaptor.addChild(root_0, char_literal9_tree);


            	    pushFollow(FOLLOW_sentence_in_singleLine157);
            	    s2=sentence();

            	    state._fsp--;

            	    adaptor.addChild(root_0, s2.getTree());

            	     sentences.add((s2!=null?s2.value:null));

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            EOL10=(Token)match(input,EOL,FOLLOW_EOL_in_singleLine168); 
            EOL10_tree = 
            (Object)adaptor.create(EOL10)
            ;
            adaptor.addChild(root_0, EOL10_tree);


             retval.value = new Statement(sentences); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "singleLine"


    public static class sentence_return extends ParserRuleReturnScope {
        public Sentence value;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sentence"
    // /home/carlos/Proyectos/logojava/Logo.g:54:1: sentence returns [Sentence value] : ( repeat | ifExp | assignment | call );
    public final LogoParser.sentence_return sentence() throws RecognitionException {
        LogoParser.sentence_return retval = new LogoParser.sentence_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        LogoParser.repeat_return repeat11 =null;

        LogoParser.ifExp_return ifExp12 =null;

        LogoParser.assignment_return assignment13 =null;

        LogoParser.call_return call14 =null;



        try {
            // /home/carlos/Proyectos/logojava/Logo.g:55:2: ( repeat | ifExp | assignment | call )
            int alt6=4;
            switch ( input.LA(1) ) {
            case REPEAT:
                {
                alt6=1;
                }
                break;
            case IF:
                {
                alt6=2;
                }
                break;
            case MAKE:
                {
                alt6=3;
                }
                break;
            case ID:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home/carlos/Proyectos/logojava/Logo.g:55:4: repeat
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_repeat_in_sentence186);
                    repeat11=repeat();

                    state._fsp--;

                    adaptor.addChild(root_0, repeat11.getTree());

                     retval.value = (repeat11!=null?repeat11.value:null); 

                    }
                    break;
                case 2 :
                    // /home/carlos/Proyectos/logojava/Logo.g:56:4: ifExp
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ifExp_in_sentence195);
                    ifExp12=ifExp();

                    state._fsp--;

                    adaptor.addChild(root_0, ifExp12.getTree());

                     retval.value = (ifExp12!=null?ifExp12.value:null); 

                    }
                    break;
                case 3 :
                    // /home/carlos/Proyectos/logojava/Logo.g:57:4: assignment
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignment_in_sentence204);
                    assignment13=assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment13.getTree());

                     retval.value = (assignment13!=null?assignment13.value:null); 

                    }
                    break;
                case 4 :
                    // /home/carlos/Proyectos/logojava/Logo.g:58:4: call
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_call_in_sentence212);
                    call14=call();

                    state._fsp--;

                    adaptor.addChild(root_0, call14.getTree());

                     retval.value = (call14!=null?call14.value:null); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sentence"


    public static class call_return extends ParserRuleReturnScope {
        public Sentence value;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "call"
    // /home/carlos/Proyectos/logojava/Logo.g:61:1: call returns [Sentence value] : ID ( expression )* ;
    public final LogoParser.call_return call() throws RecognitionException {
        LogoParser.call_return retval = new LogoParser.call_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID15=null;
        LogoParser.expression_return expression16 =null;


        Object ID15_tree=null;

        try {
            // /home/carlos/Proyectos/logojava/Logo.g:62:2: ( ID ( expression )* )
            // /home/carlos/Proyectos/logojava/Logo.g:62:8: ID ( expression )*
            {
            root_0 = (Object)adaptor.nil();


             java.util.List<Expression> arguments = new java.util.ArrayList<Expression>();

            ID15=(Token)match(input,ID,FOLLOW_ID_in_call240); 
            ID15_tree = 
            (Object)adaptor.create(ID15)
            ;
            adaptor.addChild(root_0, ID15_tree);


            // /home/carlos/Proyectos/logojava/Logo.g:63:6: ( expression )*
            loop7:
            do {
                int alt7=2;
                switch ( input.LA(1) ) {
                case COLON:
                    {
                    alt7=1;
                    }
                    break;
                case INT:
                    {
                    alt7=1;
                    }
                    break;
                case FLOAT:
                    {
                    alt7=1;
                    }
                    break;
                case STRING:
                    {
                    alt7=1;
                    }
                    break;
                case 36:
                    {
                    alt7=1;
                    }
                    break;
                case OPEN_PAR:
                    {
                    alt7=1;
                    }
                    break;
                case ID:
                    {
                    alt7=1;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // /home/carlos/Proyectos/logojava/Logo.g:63:7: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_call243);
            	    expression16=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression16.getTree());

            	    arguments.add((expression16!=null?expression16.value:null));

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


             retval.value = new Call((ID15!=null?ID15.getText():null),arguments);

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "call"


    public static class block_return extends ParserRuleReturnScope {
        public Block value;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // /home/carlos/Proyectos/logojava/Logo.g:66:1: block returns [Block value] : OPEN_BR ( EOL )? ( ( COLON v= ID )* ( EOL ) )? s1= sentence ( ( ',' | EOL ) s2= sentence )* ( EOL )? CLOSE_BR ;
    public final LogoParser.block_return block() throws RecognitionException {
        LogoParser.block_return retval = new LogoParser.block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token v=null;
        Token OPEN_BR17=null;
        Token EOL18=null;
        Token COLON19=null;
        Token EOL20=null;
        Token set21=null;
        Token EOL22=null;
        Token CLOSE_BR23=null;
        LogoParser.sentence_return s1 =null;

        LogoParser.sentence_return s2 =null;


        Object v_tree=null;
        Object OPEN_BR17_tree=null;
        Object EOL18_tree=null;
        Object COLON19_tree=null;
        Object EOL20_tree=null;
        Object set21_tree=null;
        Object EOL22_tree=null;
        Object CLOSE_BR23_tree=null;

        try {
            // /home/carlos/Proyectos/logojava/Logo.g:67:2: ( OPEN_BR ( EOL )? ( ( COLON v= ID )* ( EOL ) )? s1= sentence ( ( ',' | EOL ) s2= sentence )* ( EOL )? CLOSE_BR )
            // /home/carlos/Proyectos/logojava/Logo.g:67:4: OPEN_BR ( EOL )? ( ( COLON v= ID )* ( EOL ) )? s1= sentence ( ( ',' | EOL ) s2= sentence )* ( EOL )? CLOSE_BR
            {
            root_0 = (Object)adaptor.nil();


             
            			List<Sentence> sentences = new ArrayList<Sentence>();
            			List<String> variables = new ArrayList<String>();
            		

            OPEN_BR17=(Token)match(input,OPEN_BR,FOLLOW_OPEN_BR_in_block275); 
            OPEN_BR17_tree = 
            (Object)adaptor.create(OPEN_BR17)
            ;
            adaptor.addChild(root_0, OPEN_BR17_tree);


            // /home/carlos/Proyectos/logojava/Logo.g:71:11: ( EOL )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==EOL) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/carlos/Proyectos/logojava/Logo.g:71:12: EOL
                    {
                    EOL18=(Token)match(input,EOL,FOLLOW_EOL_in_block278); 
                    EOL18_tree = 
                    (Object)adaptor.create(EOL18)
                    ;
                    adaptor.addChild(root_0, EOL18_tree);


                    }
                    break;

            }


            // /home/carlos/Proyectos/logojava/Logo.g:71:18: ( ( COLON v= ID )* ( EOL ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==COLON||LA10_0==EOL) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/carlos/Proyectos/logojava/Logo.g:71:19: ( COLON v= ID )* ( EOL )
                    {
                    // /home/carlos/Proyectos/logojava/Logo.g:71:19: ( COLON v= ID )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==COLON) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /home/carlos/Proyectos/logojava/Logo.g:71:20: COLON v= ID
                    	    {
                    	    COLON19=(Token)match(input,COLON,FOLLOW_COLON_in_block284); 
                    	    COLON19_tree = 
                    	    (Object)adaptor.create(COLON19)
                    	    ;
                    	    adaptor.addChild(root_0, COLON19_tree);


                    	    v=(Token)match(input,ID,FOLLOW_ID_in_block288); 
                    	    v_tree = 
                    	    (Object)adaptor.create(v)
                    	    ;
                    	    adaptor.addChild(root_0, v_tree);


                    	    variables.add((v!=null?v.getText():null));

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    // /home/carlos/Proyectos/logojava/Logo.g:71:59: ( EOL )
                    // /home/carlos/Proyectos/logojava/Logo.g:71:60: EOL
                    {
                    EOL20=(Token)match(input,EOL,FOLLOW_EOL_in_block295); 
                    EOL20_tree = 
                    (Object)adaptor.create(EOL20)
                    ;
                    adaptor.addChild(root_0, EOL20_tree);


                    }


                    }
                    break;

            }


            pushFollow(FOLLOW_sentence_in_block305);
            s1=sentence();

            state._fsp--;

            adaptor.addChild(root_0, s1.getTree());

            sentences.add((s1!=null?s1.value:null));

            // /home/carlos/Proyectos/logojava/Logo.g:73:3: ( ( ',' | EOL ) s2= sentence )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==EOL) ) {
                    int LA11_1 = input.LA(2);

                    if ( ((LA11_1 >= ID && LA11_1 <= IF)||LA11_1==MAKE||LA11_1==REPEAT) ) {
                        alt11=1;
                    }


                }
                else if ( (LA11_0==COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/carlos/Proyectos/logojava/Logo.g:73:4: ( ',' | EOL ) s2= sentence
            	    {
            	    set21=(Token)input.LT(1);

            	    if ( input.LA(1)==COMMA||input.LA(1)==EOL ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set21)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_sentence_in_block321);
            	    s2=sentence();

            	    state._fsp--;

            	    adaptor.addChild(root_0, s2.getTree());

            	    sentences.add((s2!=null?s2.value:null));

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            // /home/carlos/Proyectos/logojava/Logo.g:73:56: ( EOL )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==EOL) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/carlos/Proyectos/logojava/Logo.g:73:57: EOL
                    {
                    EOL22=(Token)match(input,EOL,FOLLOW_EOL_in_block328); 
                    EOL22_tree = 
                    (Object)adaptor.create(EOL22)
                    ;
                    adaptor.addChild(root_0, EOL22_tree);


                    }
                    break;

            }


            CLOSE_BR23=(Token)match(input,CLOSE_BR,FOLLOW_CLOSE_BR_in_block335); 
            CLOSE_BR23_tree = 
            (Object)adaptor.create(CLOSE_BR23)
            ;
            adaptor.addChild(root_0, CLOSE_BR23_tree);


             retval.value = new Block(variables,sentences); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block"


    public static class repeat_return extends ParserRuleReturnScope {
        public Sentence value;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "repeat"
    // /home/carlos/Proyectos/logojava/Logo.g:76:1: repeat returns [Sentence value] : REPEAT expression block ;
    public final LogoParser.repeat_return repeat() throws RecognitionException {
        LogoParser.repeat_return retval = new LogoParser.repeat_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token REPEAT24=null;
        LogoParser.expression_return expression25 =null;

        LogoParser.block_return block26 =null;


        Object REPEAT24_tree=null;

        try {
            // /home/carlos/Proyectos/logojava/Logo.g:77:2: ( REPEAT expression block )
            // /home/carlos/Proyectos/logojava/Logo.g:77:4: REPEAT expression block
            {
            root_0 = (Object)adaptor.nil();


            REPEAT24=(Token)match(input,REPEAT,FOLLOW_REPEAT_in_repeat353); 
            REPEAT24_tree = 
            (Object)adaptor.create(REPEAT24)
            ;
            adaptor.addChild(root_0, REPEAT24_tree);


            pushFollow(FOLLOW_expression_in_repeat355);
            expression25=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression25.getTree());

            pushFollow(FOLLOW_block_in_repeat357);
            block26=block();

            state._fsp--;

            adaptor.addChild(root_0, block26.getTree());

             retval.value = new Repeat((expression25!=null?expression25.value:null),(block26!=null?block26.value:null));

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "repeat"


    public static class ifExp_return extends ParserRuleReturnScope {
        public Sentence value;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifExp"
    // /home/carlos/Proyectos/logojava/Logo.g:79:1: ifExp returns [Sentence value] : IF expression block ;
    public final LogoParser.ifExp_return ifExp() throws RecognitionException {
        LogoParser.ifExp_return retval = new LogoParser.ifExp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF27=null;
        LogoParser.expression_return expression28 =null;

        LogoParser.block_return block29 =null;


        Object IF27_tree=null;

        try {
            // /home/carlos/Proyectos/logojava/Logo.g:80:2: ( IF expression block )
            // /home/carlos/Proyectos/logojava/Logo.g:80:4: IF expression block
            {
            root_0 = (Object)adaptor.nil();


            IF27=(Token)match(input,IF,FOLLOW_IF_in_ifExp373); 
            IF27_tree = 
            (Object)adaptor.create(IF27)
            ;
            adaptor.addChild(root_0, IF27_tree);


            pushFollow(FOLLOW_expression_in_ifExp375);
            expression28=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression28.getTree());

            pushFollow(FOLLOW_block_in_ifExp377);
            block29=block();

            state._fsp--;

            adaptor.addChild(root_0, block29.getTree());

             retval.value = new IfExp((expression28!=null?expression28.value:null),(block29!=null?block29.value:null));

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifExp"


    public static class assignment_return extends ParserRuleReturnScope {
        public Sentence value;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // /home/carlos/Proyectos/logojava/Logo.g:82:1: assignment returns [Sentence value] : MAKE ID expression ;
    public final LogoParser.assignment_return assignment() throws RecognitionException {
        LogoParser.assignment_return retval = new LogoParser.assignment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MAKE30=null;
        Token ID31=null;
        LogoParser.expression_return expression32 =null;


        Object MAKE30_tree=null;
        Object ID31_tree=null;

        try {
            // /home/carlos/Proyectos/logojava/Logo.g:83:2: ( MAKE ID expression )
            // /home/carlos/Proyectos/logojava/Logo.g:83:4: MAKE ID expression
            {
            root_0 = (Object)adaptor.nil();


            MAKE30=(Token)match(input,MAKE,FOLLOW_MAKE_in_assignment398); 
            MAKE30_tree = 
            (Object)adaptor.create(MAKE30)
            ;
            adaptor.addChild(root_0, MAKE30_tree);


            ID31=(Token)match(input,ID,FOLLOW_ID_in_assignment400); 
            ID31_tree = 
            (Object)adaptor.create(ID31)
            ;
            adaptor.addChild(root_0, ID31_tree);


            pushFollow(FOLLOW_expression_in_assignment402);
            expression32=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression32.getTree());

             retval.value = new Assignment((ID31!=null?ID31.getText():null),(expression32!=null?expression32.value:null));

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment"


    public static class expression_return extends ParserRuleReturnScope {
        public Expression value;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // /home/carlos/Proyectos/logojava/Logo.g:86:1: expression returns [Expression value] : logical ;
    public final LogoParser.expression_return expression() throws RecognitionException {
        LogoParser.expression_return retval = new LogoParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        LogoParser.logical_return logical33 =null;



        try {
            // /home/carlos/Proyectos/logojava/Logo.g:87:2: ( logical )
            // /home/carlos/Proyectos/logojava/Logo.g:87:4: logical
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logical_in_expression422);
            logical33=logical();

            state._fsp--;

            adaptor.addChild(root_0, logical33.getTree());

             retval.value = (logical33!=null?logical33.value:null);

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class logical_return extends ParserRuleReturnScope {
        public Expression value;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logical"
    // /home/carlos/Proyectos/logojava/Logo.g:90:1: logical returns [Expression value] :o1= comp ( AND o2= comp | OR o2= comp | XOR o2= comp )* ;
    public final LogoParser.logical_return logical() throws RecognitionException {
        LogoParser.logical_return retval = new LogoParser.logical_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AND34=null;
        Token OR35=null;
        Token XOR36=null;
        LogoParser.comp_return o1 =null;

        LogoParser.comp_return o2 =null;


        Object AND34_tree=null;
        Object OR35_tree=null;
        Object XOR36_tree=null;

        try {
            // /home/carlos/Proyectos/logojava/Logo.g:91:2: (o1= comp ( AND o2= comp | OR o2= comp | XOR o2= comp )* )
            // /home/carlos/Proyectos/logojava/Logo.g:91:4: o1= comp ( AND o2= comp | OR o2= comp | XOR o2= comp )*
            {
            root_0 = (Object)adaptor.nil();


             LogicalOperation operation = new LogicalOperation();

            pushFollow(FOLLOW_comp_in_logical448);
            o1=comp();

            state._fsp--;

            adaptor.addChild(root_0, o1.getTree());

             operation.and((o1!=null?o1.value:null));

            // /home/carlos/Proyectos/logojava/Logo.g:93:3: ( AND o2= comp | OR o2= comp | XOR o2= comp )*
            loop13:
            do {
                int alt13=4;
                switch ( input.LA(1) ) {
                case AND:
                    {
                    alt13=1;
                    }
                    break;
                case OR:
                    {
                    alt13=2;
                    }
                    break;
                case XOR:
                    {
                    alt13=3;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // /home/carlos/Proyectos/logojava/Logo.g:94:5: AND o2= comp
            	    {
            	    AND34=(Token)match(input,AND,FOLLOW_AND_in_logical463); 
            	    AND34_tree = 
            	    (Object)adaptor.create(AND34)
            	    ;
            	    adaptor.addChild(root_0, AND34_tree);


            	    pushFollow(FOLLOW_comp_in_logical467);
            	    o2=comp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, o2.getTree());

            	     operation.and((o2!=null?o2.value:null));

            	    }
            	    break;
            	case 2 :
            	    // /home/carlos/Proyectos/logojava/Logo.g:95:5: OR o2= comp
            	    {
            	    OR35=(Token)match(input,OR,FOLLOW_OR_in_logical477); 
            	    OR35_tree = 
            	    (Object)adaptor.create(OR35)
            	    ;
            	    adaptor.addChild(root_0, OR35_tree);


            	    pushFollow(FOLLOW_comp_in_logical481);
            	    o2=comp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, o2.getTree());

            	     operation.and((o2!=null?o2.value:null));

            	    }
            	    break;
            	case 3 :
            	    // /home/carlos/Proyectos/logojava/Logo.g:96:5: XOR o2= comp
            	    {
            	    XOR36=(Token)match(input,XOR,FOLLOW_XOR_in_logical491); 
            	    XOR36_tree = 
            	    (Object)adaptor.create(XOR36)
            	    ;
            	    adaptor.addChild(root_0, XOR36_tree);


            	    pushFollow(FOLLOW_comp_in_logical495);
            	    o2=comp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, o2.getTree());

            	     operation.and((o2!=null?o2.value:null));

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


             retval.value = operation;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "logical"


    public static class comp_return extends ParserRuleReturnScope {
        public Expression value;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comp"
    // /home/carlos/Proyectos/logojava/Logo.g:100:1: comp returns [Expression value] :o1= sum ( LT o2= sum | LE o2= sum | NE o2= sum | GT o2= sum | GE o2= sum | EQ o2= sum )* ;
    public final LogoParser.comp_return comp() throws RecognitionException {
        LogoParser.comp_return retval = new LogoParser.comp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LT37=null;
        Token LE38=null;
        Token NE39=null;
        Token GT40=null;
        Token GE41=null;
        Token EQ42=null;
        LogoParser.sum_return o1 =null;

        LogoParser.sum_return o2 =null;


        Object LT37_tree=null;
        Object LE38_tree=null;
        Object NE39_tree=null;
        Object GT40_tree=null;
        Object GE41_tree=null;
        Object EQ42_tree=null;

        try {
            // /home/carlos/Proyectos/logojava/Logo.g:101:2: (o1= sum ( LT o2= sum | LE o2= sum | NE o2= sum | GT o2= sum | GE o2= sum | EQ o2= sum )* )
            // /home/carlos/Proyectos/logojava/Logo.g:101:4: o1= sum ( LT o2= sum | LE o2= sum | NE o2= sum | GT o2= sum | GE o2= sum | EQ o2= sum )*
            {
            root_0 = (Object)adaptor.nil();


             ComparativeOperation operation = new ComparativeOperation();

            pushFollow(FOLLOW_sum_in_comp530);
            o1=sum();

            state._fsp--;

            adaptor.addChild(root_0, o1.getTree());

             operation.eq((o1!=null?o1.value:null));

            // /home/carlos/Proyectos/logojava/Logo.g:103:3: ( LT o2= sum | LE o2= sum | NE o2= sum | GT o2= sum | GE o2= sum | EQ o2= sum )*
            loop14:
            do {
                int alt14=7;
                switch ( input.LA(1) ) {
                case LT:
                    {
                    alt14=1;
                    }
                    break;
                case LE:
                    {
                    alt14=2;
                    }
                    break;
                case NE:
                    {
                    alt14=3;
                    }
                    break;
                case GT:
                    {
                    alt14=4;
                    }
                    break;
                case GE:
                    {
                    alt14=5;
                    }
                    break;
                case EQ:
                    {
                    alt14=6;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // /home/carlos/Proyectos/logojava/Logo.g:104:5: LT o2= sum
            	    {
            	    LT37=(Token)match(input,LT,FOLLOW_LT_in_comp545); 
            	    LT37_tree = 
            	    (Object)adaptor.create(LT37)
            	    ;
            	    adaptor.addChild(root_0, LT37_tree);


            	    pushFollow(FOLLOW_sum_in_comp549);
            	    o2=sum();

            	    state._fsp--;

            	    adaptor.addChild(root_0, o2.getTree());

            	     operation.lt((o2!=null?o2.value:null));

            	    }
            	    break;
            	case 2 :
            	    // /home/carlos/Proyectos/logojava/Logo.g:105:5: LE o2= sum
            	    {
            	    LE38=(Token)match(input,LE,FOLLOW_LE_in_comp559); 
            	    LE38_tree = 
            	    (Object)adaptor.create(LE38)
            	    ;
            	    adaptor.addChild(root_0, LE38_tree);


            	    pushFollow(FOLLOW_sum_in_comp563);
            	    o2=sum();

            	    state._fsp--;

            	    adaptor.addChild(root_0, o2.getTree());

            	     operation.le((o2!=null?o2.value:null));

            	    }
            	    break;
            	case 3 :
            	    // /home/carlos/Proyectos/logojava/Logo.g:106:5: NE o2= sum
            	    {
            	    NE39=(Token)match(input,NE,FOLLOW_NE_in_comp573); 
            	    NE39_tree = 
            	    (Object)adaptor.create(NE39)
            	    ;
            	    adaptor.addChild(root_0, NE39_tree);


            	    pushFollow(FOLLOW_sum_in_comp577);
            	    o2=sum();

            	    state._fsp--;

            	    adaptor.addChild(root_0, o2.getTree());

            	     operation.ne((o2!=null?o2.value:null));

            	    }
            	    break;
            	case 4 :
            	    // /home/carlos/Proyectos/logojava/Logo.g:107:5: GT o2= sum
            	    {
            	    GT40=(Token)match(input,GT,FOLLOW_GT_in_comp587); 
            	    GT40_tree = 
            	    (Object)adaptor.create(GT40)
            	    ;
            	    adaptor.addChild(root_0, GT40_tree);


            	    pushFollow(FOLLOW_sum_in_comp591);
            	    o2=sum();

            	    state._fsp--;

            	    adaptor.addChild(root_0, o2.getTree());

            	     operation.gt((o2!=null?o2.value:null));

            	    }
            	    break;
            	case 5 :
            	    // /home/carlos/Proyectos/logojava/Logo.g:108:5: GE o2= sum
            	    {
            	    GE41=(Token)match(input,GE,FOLLOW_GE_in_comp601); 
            	    GE41_tree = 
            	    (Object)adaptor.create(GE41)
            	    ;
            	    adaptor.addChild(root_0, GE41_tree);


            	    pushFollow(FOLLOW_sum_in_comp605);
            	    o2=sum();

            	    state._fsp--;

            	    adaptor.addChild(root_0, o2.getTree());

            	     operation.le((o2!=null?o2.value:null));

            	    }
            	    break;
            	case 6 :
            	    // /home/carlos/Proyectos/logojava/Logo.g:109:5: EQ o2= sum
            	    {
            	    EQ42=(Token)match(input,EQ,FOLLOW_EQ_in_comp615); 
            	    EQ42_tree = 
            	    (Object)adaptor.create(EQ42)
            	    ;
            	    adaptor.addChild(root_0, EQ42_tree);


            	    pushFollow(FOLLOW_sum_in_comp619);
            	    o2=sum();

            	    state._fsp--;

            	    adaptor.addChild(root_0, o2.getTree());

            	     operation.eq((o2!=null?o2.value:null));

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


             retval.value =operation;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "comp"


    public static class sum_return extends ParserRuleReturnScope {
        public Expression value;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sum"
    // /home/carlos/Proyectos/logojava/Logo.g:113:1: sum returns [Expression value] :o1= mult ( PLUS o2= mult | MINUS o2= mult )* ;
    public final LogoParser.sum_return sum() throws RecognitionException {
        LogoParser.sum_return retval = new LogoParser.sum_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PLUS43=null;
        Token MINUS44=null;
        LogoParser.mult_return o1 =null;

        LogoParser.mult_return o2 =null;


        Object PLUS43_tree=null;
        Object MINUS44_tree=null;

        try {
            // /home/carlos/Proyectos/logojava/Logo.g:114:2: (o1= mult ( PLUS o2= mult | MINUS o2= mult )* )
            // /home/carlos/Proyectos/logojava/Logo.g:114:4: o1= mult ( PLUS o2= mult | MINUS o2= mult )*
            {
            root_0 = (Object)adaptor.nil();


             AdditiveOperation operation = new AdditiveOperation(); 

            pushFollow(FOLLOW_mult_in_sum654);
            o1=mult();

            state._fsp--;

            adaptor.addChild(root_0, o1.getTree());

             operation.sum((o1!=null?o1.value:null));

            // /home/carlos/Proyectos/logojava/Logo.g:116:3: ( PLUS o2= mult | MINUS o2= mult )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==PLUS) ) {
                    alt15=1;
                }
                else if ( (LA15_0==MINUS) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/carlos/Proyectos/logojava/Logo.g:117:5: PLUS o2= mult
            	    {
            	    PLUS43=(Token)match(input,PLUS,FOLLOW_PLUS_in_sum669); 
            	    PLUS43_tree = 
            	    (Object)adaptor.create(PLUS43)
            	    ;
            	    adaptor.addChild(root_0, PLUS43_tree);


            	    pushFollow(FOLLOW_mult_in_sum673);
            	    o2=mult();

            	    state._fsp--;

            	    adaptor.addChild(root_0, o2.getTree());

            	     operation.sum((o2!=null?o2.value:null));

            	    }
            	    break;
            	case 2 :
            	    // /home/carlos/Proyectos/logojava/Logo.g:118:5: MINUS o2= mult
            	    {
            	    MINUS44=(Token)match(input,MINUS,FOLLOW_MINUS_in_sum684); 
            	    MINUS44_tree = 
            	    (Object)adaptor.create(MINUS44)
            	    ;
            	    adaptor.addChild(root_0, MINUS44_tree);


            	    pushFollow(FOLLOW_mult_in_sum688);
            	    o2=mult();

            	    state._fsp--;

            	    adaptor.addChild(root_0, o2.getTree());

            	     operation.sub((o2!=null?o2.value:null));

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


             retval.value = operation;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sum"


    public static class mult_return extends ParserRuleReturnScope {
        public Expression value;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mult"
    // /home/carlos/Proyectos/logojava/Logo.g:122:1: mult returns [Expression value] :o1= atom ( MULT o2= atom | DIV o2= atom )* ;
    public final LogoParser.mult_return mult() throws RecognitionException {
        LogoParser.mult_return retval = new LogoParser.mult_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MULT45=null;
        Token DIV46=null;
        LogoParser.atom_return o1 =null;

        LogoParser.atom_return o2 =null;


        Object MULT45_tree=null;
        Object DIV46_tree=null;

        try {
            // /home/carlos/Proyectos/logojava/Logo.g:123:2: (o1= atom ( MULT o2= atom | DIV o2= atom )* )
            // /home/carlos/Proyectos/logojava/Logo.g:123:4: o1= atom ( MULT o2= atom | DIV o2= atom )*
            {
            root_0 = (Object)adaptor.nil();


             ProductOperation operation = new ProductOperation();

            pushFollow(FOLLOW_atom_in_mult723);
            o1=atom();

            state._fsp--;

            adaptor.addChild(root_0, o1.getTree());

             operation.mult((o1!=null?o1.value:null));

            // /home/carlos/Proyectos/logojava/Logo.g:125:3: ( MULT o2= atom | DIV o2= atom )*
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==MULT) ) {
                    alt16=1;
                }
                else if ( (LA16_0==DIV) ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/carlos/Proyectos/logojava/Logo.g:126:5: MULT o2= atom
            	    {
            	    MULT45=(Token)match(input,MULT,FOLLOW_MULT_in_mult738); 
            	    MULT45_tree = 
            	    (Object)adaptor.create(MULT45)
            	    ;
            	    adaptor.addChild(root_0, MULT45_tree);


            	    pushFollow(FOLLOW_atom_in_mult742);
            	    o2=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, o2.getTree());

            	     operation.mult((o2!=null?o2.value:null));

            	    }
            	    break;
            	case 2 :
            	    // /home/carlos/Proyectos/logojava/Logo.g:127:5: DIV o2= atom
            	    {
            	    DIV46=(Token)match(input,DIV,FOLLOW_DIV_in_mult752); 
            	    DIV46_tree = 
            	    (Object)adaptor.create(DIV46)
            	    ;
            	    adaptor.addChild(root_0, DIV46_tree);


            	    pushFollow(FOLLOW_atom_in_mult756);
            	    o2=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, o2.getTree());

            	     operation.div((o2!=null?o2.value:null));

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


             retval.value = operation;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mult"


    public static class array_return extends ParserRuleReturnScope {
        public Expression value;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array"
    // /home/carlos/Proyectos/logojava/Logo.g:131:1: array returns [Expression value] : ( '{' !e1= expression ( ',' e2= expression )* '}' !) ;
    public final LogoParser.array_return array() throws RecognitionException {
        LogoParser.array_return retval = new LogoParser.array_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal47=null;
        Token char_literal48=null;
        Token char_literal49=null;
        LogoParser.expression_return e1 =null;

        LogoParser.expression_return e2 =null;


        Object char_literal47_tree=null;
        Object char_literal48_tree=null;
        Object char_literal49_tree=null;

        try {
            // /home/carlos/Proyectos/logojava/Logo.g:132:2: ( ( '{' !e1= expression ( ',' e2= expression )* '}' !) )
            // /home/carlos/Proyectos/logojava/Logo.g:133:3: ( '{' !e1= expression ( ',' e2= expression )* '}' !)
            {
            root_0 = (Object)adaptor.nil();


             ArrayLiteral array = new ArrayLiteral();

            // /home/carlos/Proyectos/logojava/Logo.g:134:3: ( '{' !e1= expression ( ',' e2= expression )* '}' !)
            // /home/carlos/Proyectos/logojava/Logo.g:134:4: '{' !e1= expression ( ',' e2= expression )* '}' !
            {
            char_literal47=(Token)match(input,36,FOLLOW_36_in_array793); 

            pushFollow(FOLLOW_expression_in_array802);
            e1=expression();

            state._fsp--;

            adaptor.addChild(root_0, e1.getTree());

             array.add((e1!=null?e1.value:null).evaluate(context)); 

            // /home/carlos/Proyectos/logojava/Logo.g:136:4: ( ',' e2= expression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/carlos/Proyectos/logojava/Logo.g:136:5: ',' e2= expression
            	    {
            	    char_literal48=(Token)match(input,COMMA,FOLLOW_COMMA_in_array810); 
            	    char_literal48_tree = 
            	    (Object)adaptor.create(char_literal48)
            	    ;
            	    adaptor.addChild(root_0, char_literal48_tree);


            	    pushFollow(FOLLOW_expression_in_array814);
            	    e2=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, e2.getTree());

            	     array.add((e2!=null?e2.value:null).evaluate(context)); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            char_literal49=(Token)match(input,37,FOLLOW_37_in_array822); 

            }


             retval.value = array; 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "array"


    public static class atom_return extends ParserRuleReturnScope {
        public Expression value;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home/carlos/Proyectos/logojava/Logo.g:148:1: atom returns [Expression value] : ( varref | INT | FLOAT | STRING | array | ( OPEN_PAR ! expression CLOSE_PAR !) | call );
    public final LogoParser.atom_return atom() throws RecognitionException {
        LogoParser.atom_return retval = new LogoParser.atom_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INT51=null;
        Token FLOAT52=null;
        Token STRING53=null;
        Token OPEN_PAR55=null;
        Token CLOSE_PAR57=null;
        LogoParser.varref_return varref50 =null;

        LogoParser.array_return array54 =null;

        LogoParser.expression_return expression56 =null;

        LogoParser.call_return call58 =null;


        Object INT51_tree=null;
        Object FLOAT52_tree=null;
        Object STRING53_tree=null;
        Object OPEN_PAR55_tree=null;
        Object CLOSE_PAR57_tree=null;

        try {
            // /home/carlos/Proyectos/logojava/Logo.g:149:2: ( varref | INT | FLOAT | STRING | array | ( OPEN_PAR ! expression CLOSE_PAR !) | call )
            int alt18=7;
            switch ( input.LA(1) ) {
            case COLON:
                {
                alt18=1;
                }
                break;
            case INT:
                {
                alt18=2;
                }
                break;
            case FLOAT:
                {
                alt18=3;
                }
                break;
            case STRING:
                {
                alt18=4;
                }
                break;
            case 36:
                {
                alt18=5;
                }
                break;
            case OPEN_PAR:
                {
                alt18=6;
                }
                break;
            case ID:
                {
                alt18=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // /home/carlos/Proyectos/logojava/Logo.g:149:4: varref
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varref_in_atom850);
                    varref50=varref();

                    state._fsp--;

                    adaptor.addChild(root_0, varref50.getTree());

                     retval.value = (varref50!=null?varref50.value:null); 

                    }
                    break;
                case 2 :
                    // /home/carlos/Proyectos/logojava/Logo.g:150:4: INT
                    {
                    root_0 = (Object)adaptor.nil();


                    INT51=(Token)match(input,INT,FOLLOW_INT_in_atom860); 
                    INT51_tree = 
                    (Object)adaptor.create(INT51)
                    ;
                    adaptor.addChild(root_0, INT51_tree);


                     retval.value = new Literal(Integer.valueOf((INT51!=null?INT51.getText():null))); 

                    }
                    break;
                case 3 :
                    // /home/carlos/Proyectos/logojava/Logo.g:151:4: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();


                    FLOAT52=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_atom870); 
                    FLOAT52_tree = 
                    (Object)adaptor.create(FLOAT52)
                    ;
                    adaptor.addChild(root_0, FLOAT52_tree);


                     retval.value = new Literal(Float.valueOf((FLOAT52!=null?FLOAT52.getText():null))); 

                    }
                    break;
                case 4 :
                    // /home/carlos/Proyectos/logojava/Logo.g:152:4: STRING
                    {
                    root_0 = (Object)adaptor.nil();


                    STRING53=(Token)match(input,STRING,FOLLOW_STRING_in_atom880); 
                    STRING53_tree = 
                    (Object)adaptor.create(STRING53)
                    ;
                    adaptor.addChild(root_0, STRING53_tree);


                     retval.value = new Literal((STRING53!=null?STRING53.getText():null).substring(1,(STRING53!=null?STRING53.getText():null).length()-1));

                    }
                    break;
                case 5 :
                    // /home/carlos/Proyectos/logojava/Logo.g:153:4: array
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_array_in_atom890);
                    array54=array();

                    state._fsp--;

                    adaptor.addChild(root_0, array54.getTree());

                     retval.value = (array54!=null?array54.value:null);

                    }
                    break;
                case 6 :
                    // /home/carlos/Proyectos/logojava/Logo.g:154:4: ( OPEN_PAR ! expression CLOSE_PAR !)
                    {
                    root_0 = (Object)adaptor.nil();


                    // /home/carlos/Proyectos/logojava/Logo.g:154:4: ( OPEN_PAR ! expression CLOSE_PAR !)
                    // /home/carlos/Proyectos/logojava/Logo.g:154:5: OPEN_PAR ! expression CLOSE_PAR !
                    {
                    OPEN_PAR55=(Token)match(input,OPEN_PAR,FOLLOW_OPEN_PAR_in_atom901); 

                    pushFollow(FOLLOW_expression_in_atom904);
                    expression56=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression56.getTree());

                    CLOSE_PAR57=(Token)match(input,CLOSE_PAR,FOLLOW_CLOSE_PAR_in_atom906); 

                    }


                     retval.value = (expression56!=null?expression56.value:null);

                    }
                    break;
                case 7 :
                    // /home/carlos/Proyectos/logojava/Logo.g:156:4: call
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_call_in_atom923);
                    call58=call();

                    state._fsp--;

                    adaptor.addChild(root_0, call58.getTree());

                     retval.value = (call58!=null?call58.value:null);

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class varref_return extends ParserRuleReturnScope {
        public VarRef value;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varref"
    // /home/carlos/Proyectos/logojava/Logo.g:159:1: varref returns [VarRef value] : COLON ID ;
    public final LogoParser.varref_return varref() throws RecognitionException {
        LogoParser.varref_return retval = new LogoParser.varref_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COLON59=null;
        Token ID60=null;

        Object COLON59_tree=null;
        Object ID60_tree=null;

        try {
            // /home/carlos/Proyectos/logojava/Logo.g:160:2: ( COLON ID )
            // /home/carlos/Proyectos/logojava/Logo.g:160:4: COLON ID
            {
            root_0 = (Object)adaptor.nil();


            COLON59=(Token)match(input,COLON,FOLLOW_COLON_in_varref943); 
            COLON59_tree = 
            (Object)adaptor.create(COLON59)
            ;
            adaptor.addChild(root_0, COLON59_tree);


            ID60=(Token)match(input,ID,FOLLOW_ID_in_varref945); 
            ID60_tree = 
            (Object)adaptor.create(ID60)
            ;
            adaptor.addChild(root_0, ID60_tree);


             retval.value = new VarRef((ID60!=null?ID60.getText():null));

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "varref"

    // Delegated rules


 

    public static final BitSet FOLLOW_function_in_program49 = new BitSet(new long[]{0x0000000240460002L});
    public static final BitSet FOLLOW_statement_in_program51 = new BitSet(new long[]{0x0000000240460002L});
    public static final BitSet FOLLOW_TO_in_function70 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_function74 = new BitSet(new long[]{0x0000000000001080L});
    public static final BitSet FOLLOW_varref_in_function80 = new BitSet(new long[]{0x0000000000001080L});
    public static final BitSet FOLLOW_EOL_in_function86 = new BitSet(new long[]{0x0000000040460000L});
    public static final BitSet FOLLOW_singleLine_in_function91 = new BitSet(new long[]{0x0000000040460800L});
    public static final BitSet FOLLOW_END_in_function99 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_EOL_in_function105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_singleLine_in_statement118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sentence_in_singleLine145 = new BitSet(new long[]{0x0000000000001080L});
    public static final BitSet FOLLOW_COLON_in_singleLine153 = new BitSet(new long[]{0x0000000040460000L});
    public static final BitSet FOLLOW_sentence_in_singleLine157 = new BitSet(new long[]{0x0000000000001080L});
    public static final BitSet FOLLOW_EOL_in_singleLine168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repeat_in_sentence186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExp_in_sentence195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_sentence204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_sentence212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_call240 = new BitSet(new long[]{0x00000011080A4082L});
    public static final BitSet FOLLOW_expression_in_call243 = new BitSet(new long[]{0x00000011080A4082L});
    public static final BitSet FOLLOW_OPEN_BR_in_block275 = new BitSet(new long[]{0x0000000040461080L});
    public static final BitSet FOLLOW_EOL_in_block278 = new BitSet(new long[]{0x0000000040461080L});
    public static final BitSet FOLLOW_COLON_in_block284 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_block288 = new BitSet(new long[]{0x0000000000001080L});
    public static final BitSet FOLLOW_EOL_in_block295 = new BitSet(new long[]{0x0000000040460000L});
    public static final BitSet FOLLOW_sentence_in_block305 = new BitSet(new long[]{0x0000000000001120L});
    public static final BitSet FOLLOW_set_in_block313 = new BitSet(new long[]{0x0000000040460000L});
    public static final BitSet FOLLOW_sentence_in_block321 = new BitSet(new long[]{0x0000000000001120L});
    public static final BitSet FOLLOW_EOL_in_block328 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CLOSE_BR_in_block335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEAT_in_repeat353 = new BitSet(new long[]{0x00000011080A4080L});
    public static final BitSet FOLLOW_expression_in_repeat355 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_block_in_repeat357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExp373 = new BitSet(new long[]{0x00000011080A4080L});
    public static final BitSet FOLLOW_expression_in_ifExp375 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_block_in_ifExp377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAKE_in_assignment398 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_assignment400 = new BitSet(new long[]{0x00000011080A4080L});
    public static final BitSet FOLLOW_expression_in_assignment402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_in_expression422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comp_in_logical448 = new BitSet(new long[]{0x0000000810000012L});
    public static final BitSet FOLLOW_AND_in_logical463 = new BitSet(new long[]{0x00000011080A4080L});
    public static final BitSet FOLLOW_comp_in_logical467 = new BitSet(new long[]{0x0000000810000012L});
    public static final BitSet FOLLOW_OR_in_logical477 = new BitSet(new long[]{0x00000011080A4080L});
    public static final BitSet FOLLOW_comp_in_logical481 = new BitSet(new long[]{0x0000000810000012L});
    public static final BitSet FOLLOW_XOR_in_logical491 = new BitSet(new long[]{0x00000011080A4080L});
    public static final BitSet FOLLOW_comp_in_logical495 = new BitSet(new long[]{0x0000000810000012L});
    public static final BitSet FOLLOW_sum_in_comp530 = new BitSet(new long[]{0x000000000231A002L});
    public static final BitSet FOLLOW_LT_in_comp545 = new BitSet(new long[]{0x00000011080A4080L});
    public static final BitSet FOLLOW_sum_in_comp549 = new BitSet(new long[]{0x000000000231A002L});
    public static final BitSet FOLLOW_LE_in_comp559 = new BitSet(new long[]{0x00000011080A4080L});
    public static final BitSet FOLLOW_sum_in_comp563 = new BitSet(new long[]{0x000000000231A002L});
    public static final BitSet FOLLOW_NE_in_comp573 = new BitSet(new long[]{0x00000011080A4080L});
    public static final BitSet FOLLOW_sum_in_comp577 = new BitSet(new long[]{0x000000000231A002L});
    public static final BitSet FOLLOW_GT_in_comp587 = new BitSet(new long[]{0x00000011080A4080L});
    public static final BitSet FOLLOW_sum_in_comp591 = new BitSet(new long[]{0x000000000231A002L});
    public static final BitSet FOLLOW_GE_in_comp601 = new BitSet(new long[]{0x00000011080A4080L});
    public static final BitSet FOLLOW_sum_in_comp605 = new BitSet(new long[]{0x000000000231A002L});
    public static final BitSet FOLLOW_EQ_in_comp615 = new BitSet(new long[]{0x00000011080A4080L});
    public static final BitSet FOLLOW_sum_in_comp619 = new BitSet(new long[]{0x000000000231A002L});
    public static final BitSet FOLLOW_mult_in_sum654 = new BitSet(new long[]{0x0000000020800002L});
    public static final BitSet FOLLOW_PLUS_in_sum669 = new BitSet(new long[]{0x00000011080A4080L});
    public static final BitSet FOLLOW_mult_in_sum673 = new BitSet(new long[]{0x0000000020800002L});
    public static final BitSet FOLLOW_MINUS_in_sum684 = new BitSet(new long[]{0x00000011080A4080L});
    public static final BitSet FOLLOW_mult_in_sum688 = new BitSet(new long[]{0x0000000020800002L});
    public static final BitSet FOLLOW_atom_in_mult723 = new BitSet(new long[]{0x0000000001000202L});
    public static final BitSet FOLLOW_MULT_in_mult738 = new BitSet(new long[]{0x00000011080A4080L});
    public static final BitSet FOLLOW_atom_in_mult742 = new BitSet(new long[]{0x0000000001000202L});
    public static final BitSet FOLLOW_DIV_in_mult752 = new BitSet(new long[]{0x00000011080A4080L});
    public static final BitSet FOLLOW_atom_in_mult756 = new BitSet(new long[]{0x0000000001000202L});
    public static final BitSet FOLLOW_36_in_array793 = new BitSet(new long[]{0x00000011080A4080L});
    public static final BitSet FOLLOW_expression_in_array802 = new BitSet(new long[]{0x0000002000000100L});
    public static final BitSet FOLLOW_COMMA_in_array810 = new BitSet(new long[]{0x00000011080A4080L});
    public static final BitSet FOLLOW_expression_in_array814 = new BitSet(new long[]{0x0000002000000100L});
    public static final BitSet FOLLOW_37_in_array822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varref_in_atom850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_atom870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_atom890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PAR_in_atom901 = new BitSet(new long[]{0x00000011080A4080L});
    public static final BitSet FOLLOW_expression_in_atom904 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CLOSE_PAR_in_atom906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_atom923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_varref943 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_varref945 = new BitSet(new long[]{0x0000000000000002L});

}