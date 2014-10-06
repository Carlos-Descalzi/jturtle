package logo.expressions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import logo.parser.Operations;
import logo.ui.Context;

public class LogicalOperation implements Expression {

	private enum Operator {
		AND,
		OR,
		XOR
	}
	
	private class Term {
		private Operator operator;
		private Expression operand;
		
		public Term(Operator operator,Expression operand){
			this.operator = operator;
			this.operand = operand;
		}
	}
	
	private List<Term> terms = new ArrayList<Term>();
	

	public void and(Expression operand){
		terms.add(new Term(Operator.AND,operand));
	}

	public void or(Expression operand){
		terms.add(new Term(Operator.OR,operand));
	}

	public void xor(Expression operand){
		terms.add(new Term(Operator.XOR,operand));
	}
	
	@Override
	public Object evaluate(Context context) {
		
		Iterator<Term> i = terms.iterator();
		
		Object value = i.next().operand.evaluate(context);
		
		while (i.hasNext()){
			Term next = i.next();
			switch (next.operator){
			case AND: value = Operations.and(value, next.operand.evaluate(context)); break;
			case OR: value = Operations.and(value, next.operand.evaluate(context)); break;
			case XOR: value = Operations.and(value, next.operand.evaluate(context)); break;
			}
		}
		
		return value;
	}

}
