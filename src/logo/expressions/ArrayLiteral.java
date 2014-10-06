package logo.expressions;

import java.util.ArrayList;
import java.util.List;

import logo.ui.Context;

public class ArrayLiteral implements Expression {

	private List<Object> value = new ArrayList<Object>();

	public ArrayLiteral(){
	}
	
	public ArrayLiteral add(Object value){
		this.value.add(value);
		return this;
	}
	
	public Object evaluate(Context context){
		return value;
	}
}
