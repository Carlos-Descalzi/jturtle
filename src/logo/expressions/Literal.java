package logo.expressions;

import logo.ui.Context;

public class Literal implements Expression {

	private Object value;

	public Literal(Object value){
		this.value = value;
	}
	
	public Object evaluate(Context context){
		return value;
	}
}
