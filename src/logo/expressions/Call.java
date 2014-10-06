package logo.expressions;

import java.util.ArrayList;
import java.util.List;

import logo.ui.Context;

public class Call implements Sentence {

	private String functionName;
	private List<Expression> arguments;
	
	public Call(String functionName, List<Expression> arguments){
		this.functionName = functionName;
		this.arguments = arguments;
	}
	
	public Object evaluate(Context context){
		
		List<Object> argumentValues = new ArrayList<Object>();
		for (Expression argument:arguments){
			argumentValues.add(argument.evaluate(context));
		}
		
		return context.callFunction(functionName, argumentValues);
	}
}
