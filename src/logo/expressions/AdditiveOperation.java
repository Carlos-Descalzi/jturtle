package logo.expressions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import logo.parser.Operations;
import logo.ui.Context;

public class AdditiveOperation implements Expression {

	private class Term {
		private boolean add = true;
		private Expression operand;
		
		public Term(boolean add,Expression operand){
			this.add = add;
			this.operand = operand;
		}
	}
	
	private List<Term> terms = new ArrayList<Term>();
	
	public void sum(Expression operator){
		terms.add(new Term(true,operator));
	}
	
	public void sub(Expression operator){
		terms.add(new Term(false,operator));
	}
	
	@Override
	public Object evaluate(Context context) {
		Iterator<Term> i = terms.iterator();
		Object value = i.next().operand.evaluate(context);

		while (i.hasNext()){
			Term next = i.next();
			
			value = next.add 
					? Operations.add(value,next.operand.evaluate(context))
					: Operations.sub(value,next.operand.evaluate(context));
		}
		
		return value;
	}

}
