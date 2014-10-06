package logo.functions;

import java.util.List;

import logo.ui.Context;

public interface Function {

	public Object invoke(Context context,List<Object> arguments);
	public String getName();
}
