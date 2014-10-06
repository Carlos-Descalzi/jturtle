package logo.functions;

import java.util.List;

import logo.ui.Context;

public class Pow 
	implements Function{
	
	@Override
	public Object invoke(Context context,List<Object> arguments) {
		
		if (arguments.size() == 2){
			Object val = arguments.get(0);
			Object pow = arguments.get(1);
			if (val instanceof Number && pow instanceof Number){
				return Math.pow(((Number)val).doubleValue(),((Number)pow).doubleValue());
			}
		}
		
		return 0;
	}

	@Override
	public String getName() {
		return "pow";
	}

}
