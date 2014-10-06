package logo.functions;

import java.util.List;

import logo.ui.Context;

public class Sleep implements Function {
	
	public Sleep(){
	}
	
	@Override
	public Object invoke(Context context,List<Object> arguments) {
		Integer value = (Integer)arguments.get(0);
		try {
			Thread.sleep(value.longValue());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String getName() {
		return "sleep";
	}

}
