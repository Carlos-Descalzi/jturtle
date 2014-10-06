package logo.functions;

import java.util.List;

import logo.ui.Context;
import logo.ui.DrawingArea;

public class BeginFill 
	implements Function{

	private DrawingArea drawingArea;
	
	public BeginFill(DrawingArea drawingArea){
		this.drawingArea = drawingArea;
	}
	
	@Override
	public Object invoke(Context context,List<Object> arguments) {
		drawingArea.beginFill();
		return null;
	}

	@Override
	public String getName() {
		return "beginfill";
	}

}
