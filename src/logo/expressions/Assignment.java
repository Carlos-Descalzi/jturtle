package logo.expressions;

import logo.ui.Context;

public class Assignment implements Sentence {

	private String varName;
	private Expression value;
	
	public Assignment(String varName, Expression value){
		this.varName = varName;
		this.value = value;
	}

	@Override
	public Object evaluate(Context context) {
		Object value = this.value.evaluate(context);
		context.setVariable(varName, value);
		return value;
	}
}
