package logo.ui;

import java.util.List;

import logo.functions.Function;

public interface Context {

	public void setVariable(String name,Object value);
	public Object getVariable(String name);
	public Object callFunction(String name,List<Object> arguments);
	public void addFunction(Function function);
	public Context subContext();
}
