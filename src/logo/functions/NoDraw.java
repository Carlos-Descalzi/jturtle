package logo.functions;

import java.util.List;

import logo.ui.Context;
import logo.ui.DrawingArea;

public class NoDraw 
	implements Function{

	private DrawingArea drawingArea;
	
	public NoDraw(DrawingArea drawingArea){
		this.drawingArea = drawingArea;
	}
	
	@Override
	public Object invoke(Context context,List<Object> arguments) {
		drawingArea.noDraw();
		
		return null;
	}

	@Override
	public String getName() {
		return "nodraw";
	}

}
