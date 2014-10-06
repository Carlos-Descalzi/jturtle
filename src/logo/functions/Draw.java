package logo.functions;

import java.util.List;

import logo.ui.Context;
import logo.ui.DrawingArea;

public class Draw 
	implements Function{

	private DrawingArea drawingArea;
	
	public Draw(DrawingArea drawingArea){
		this.drawingArea = drawingArea;
	}
	
	@Override
	public Object invoke(Context context,List<Object> arguments) {
		drawingArea.draw();
		return null;
	}

	@Override
	public String getName() {
		return "draw";
	}

}
