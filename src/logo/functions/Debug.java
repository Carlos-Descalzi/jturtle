package logo.functions;

import java.util.Iterator;
import java.util.List;

import logo.ui.Context;
import logo.ui.cl.CommandLine;

public class Debug implements Function {

	private CommandLine logView;
	
	public Debug(CommandLine logView){
		this.logView = logView;
	}
	
	@Override
	public Object invoke(Context context,List<Object> arguments) {
		String string = "";
		for (Iterator<Object> i = arguments.iterator();i.hasNext();){
			string+=i.next();
			if (i.hasNext()) string+=" ";
		}
		logView.error(string);
		return null;
	}

	@Override
	public String getName() {
		return "debug";
	}

}
