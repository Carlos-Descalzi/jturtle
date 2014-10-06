package logo.expressions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import logo.parser.Operations;
import logo.ui.Context;

public class ProductOperation implements Expression {

	private enum Operator {
		MULT,
		DIV
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
	
	public void mult(Expression operator){
		if (operator == null) throw new NullPointerException();
			
		terms.add(new Term(Operator.MULT,operator));
	}
	
	public void div(Expression operator){
		terms.add(new Term(Operator.DIV,operator));
	}
	
	@Override
	public Object evaluate(Context context) {
		Iterator<Term> i = terms.iterator();
		Term first = i.next();
		Object value = first.operand.evaluate(context);
		
		while (i.hasNext()){
			Term next = i.next();
			switch (next.operator){
			case MULT: value = Operations.mul(value, next.operand.evaluate(context)); break;
			case DIV: value = Operations.div(value, next.operand.evaluate(context)); break;
			}
		}
		
		return value;
	}

}
