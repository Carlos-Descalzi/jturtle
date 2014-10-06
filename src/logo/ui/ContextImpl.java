package logo.ui;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import logo.expressions.Nothing;
import logo.functions.Function;

public class ContextImpl implements Context {

	private Map<String,Object> variables = new HashMap<String,Object>();
	private Map<String,Function> functions = new HashMap<String,Function>();
	private ErrorReporter errorReporter;
	
	public Context subContext(){
		ContextImpl subContext = new ContextImpl();
		subContext.functions.putAll(functions);
		subContext.errorReporter = errorReporter;
		subContext.variables.putAll(variables);
		return subContext;
	}
	public void setErrorReporter(ErrorReporter errorReporter){
		this.errorReporter = errorReporter;
	}
	
	@Override
	public void setVariable(String name, Object value) {
		variables.put(name, value);
	}

	@Override
	public Object getVariable(String name) {
		
		if (!variables.containsKey(name)){
			errorReporter.reportError("I don't know what's "+name+"!");
		}
		
		return variables.get(name);
	}

	@Override
	public Object callFunction(String name, List<Object> arguments) {
		Function function = functions.get(name.toLowerCase());
		
		if (function != null){
			Object returnValue = function.invoke(this,arguments);
			return returnValue == null ? Nothing.VALUE : returnValue;
		} else {
			errorReporter.reportError("I don't know how to "+name+"!");
		}
		return Nothing.VALUE;

	}

	public void addFunction(Function function) {
		functions.put(function.getName().toLowerCase(), function);
	}

}
