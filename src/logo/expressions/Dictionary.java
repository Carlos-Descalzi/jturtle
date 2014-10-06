package logo.expressions;

import java.util.LinkedHashMap;
import java.util.Map;

import logo.ui.Context;

public class Dictionary implements Expression {

	private Map<Object,Object> value = new LinkedHashMap<Object,Object>();

	public Dictionary(){
	}
	
	public void put(Object key,Object value){
		this.value.put(key,value);
	}
	
	public Object evaluate(Context context){
		return value;
	}
}
