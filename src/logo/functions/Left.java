package logo.functions;

import java.util.List;

import logo.ui.Context;
import logo.ui.DrawingArea;

public class Left 
	implements Function{

	private DrawingArea drawingArea;
	
	public Left(DrawingArea drawingArea){
		this.drawingArea = drawingArea;
	}
	
	@Override
	public Object invoke(Context context,List<Object> arguments) {

		Number angle = (Number)arguments.get(0);
		
		drawingArea.left(angle.doubleValue());
		
		return null;
	}

	@Override
	public String getName() {
		return "left";
	}

}
