package logo.functions;

import java.util.List;

import logo.ui.Context;
import logo.ui.DrawingArea;

public class GoTo 
	implements Function{

	private DrawingArea drawingArea;
	
	public GoTo(DrawingArea drawingArea){
		this.drawingArea = drawingArea;
	}
	
	@Override
	public Object invoke(Context context,List<Object> arguments) {

		int x = ((Number)arguments.get(0)).intValue();
		int y = ((Number)arguments.get(1)).intValue();
		
		drawingArea.goTo(x,y);
		
		return null;
	}

	@Override
	public String getName() {
		return "goto";
	}

}
