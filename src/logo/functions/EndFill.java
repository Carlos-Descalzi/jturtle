package logo.functions;

import java.util.List;

import logo.ui.Context;
import logo.ui.DrawingArea;

public class EndFill 
	implements Function{

	private DrawingArea drawingArea;
	
	public EndFill(DrawingArea drawingArea){
		this.drawingArea = drawingArea;
	}
	
	@Override
	public Object invoke(Context context,List<Object> arguments) {
		drawingArea.endFill();
		return null;
	}

	@Override
	public String getName() {
		return "endfill";
	}

}
