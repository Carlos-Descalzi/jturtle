package logo.functions;

import java.util.List;

import logo.ui.Context;
import logo.ui.DrawingArea;

public class Right 
	implements Function{

	private DrawingArea drawingArea;
	
	public Right(DrawingArea drawingArea){
		this.drawingArea = drawingArea;
	}
	
	@Override
	public Object invoke(Context context,List<Object> arguments) {

		Number angle = (Number)arguments.get(0);
		
		drawingArea.right(angle.doubleValue());
		
		return null;
	}

	@Override
	public String getName() {
		return "right";
	}

}
