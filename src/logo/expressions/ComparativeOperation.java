package logo.expressions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import logo.parser.Operations;
import logo.ui.Context;

public class ComparativeOperation implements Expression {

	private enum Operator {
		LT,
		LE,
		GT,
		GE,
		EQ,
		NE
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
	

	public void lt(Expression operand){
		terms.add(new Term(Operator.LT,operand));
	}

	public void le(Expression operand){
		terms.add(new Term(Operator.LE,operand));
	}

	public void gt(Expression operand){
		terms.add(new Term(Operator.GT,operand));
	}

	public void ge(Expression operand){
		terms.add(new Term(Operator.GE,operand));
	}

	public void eq(Expression operand){
		terms.add(new Term(Operator.EQ,operand));
	}

	public void ne(Expression operand){
		terms.add(new Term(Operator.NE,operand));
	}
	
	@Override
	public Object evaluate(Context context) {
		
		Iterator<Term> i = terms.iterator();
		
		Object value = i.next().operand.evaluate(context);
		
		while (i.hasNext()){
			Term next = i.next();
			switch (next.operator){
			case LT: value = Operations.lt(value, next.operand.evaluate(context)); break;
			case LE: value = Operations.le(value, next.operand.evaluate(context)); break;
			case GT: value = Operations.gt(value, next.operand.evaluate(context)); break;
			case GE: value = Operations.ge(value, next.operand.evaluate(context)); break;
			case EQ: value = Operations.eq(value, next.operand.evaluate(context)); break;
			case NE: value = Operations.eq(value, next.operand.evaluate(context)) == 1 ? 0 : 1; break;
			}
		}
		
		return value;
	}

}
