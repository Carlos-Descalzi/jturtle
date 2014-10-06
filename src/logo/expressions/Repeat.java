package logo.expressions;

import logo.ui.Context;

public class Repeat implements Sentence {

	private Expression expression;
	private Block block;
	
	public Repeat(Expression expression,Block block){
		this.expression = expression;
		this.block = block;
	}
	@Override
	public Object evaluate(Context context) {
		
		Object value = expression.evaluate(context);
		
		if (value instanceof Integer){
			for (int i=0;i<((Integer)value);i++){
				block.evaluate(context);
			}
		}
		return Nothing.VALUE;
	}

}
