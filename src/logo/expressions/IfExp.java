package logo.expressions;

import logo.ui.Context;

public class IfExp implements Sentence {

	private Expression expression;
	private Block block;
	
	public IfExp(Expression expression,Block block){
		this.expression = expression;
		this.block = block;
	}
	@Override
	public Object evaluate(Context context) {
		
		Object value = expression.evaluate(context);
		
		if (value != null && value instanceof Integer && ((Integer)value) != 0 ){
				block.evaluate(context);
		}
		return Nothing.VALUE;
	}

}
