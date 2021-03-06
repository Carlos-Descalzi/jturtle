package logo.functions;

import java.util.List;

import logo.ui.Context;
import logo.ui.DrawingArea;

public class Clear 
	implements Function{

	private DrawingArea drawingArea;
	
	public Clear(DrawingArea drawingArea){
		this.drawingArea = drawingArea;
	}
	
	@Override
	public Object invoke(Context context,List<Object> arguments) {
		drawingArea.clear();
		return null;
	}

	@Override
	public String getName() {
		return "clear";
	}

}
