package logo.functions;

import java.util.List;

import logo.ui.Context;

public class Cos 
	implements Function{
	
	@Override
	public Object invoke(Context context,List<Object> arguments) {
		
		if (!arguments.isEmpty()){
			Object val = arguments.get(0);
			
			if (val instanceof Number){
				return Math.cos(((Number)val).doubleValue() * Math.PI / 180);
			}
		}
		
		return 0;
	}

	@Override
	public String getName() {
		return "cos";
	}

}
