package logo.functions;

import java.util.List;

import logo.ui.Context;
import logo.ui.DrawingArea;

public class Show implements Function {

	private DrawingArea drawingArea;
	
	public Show(DrawingArea drawingArea){
		this.drawingArea = drawingArea;
	}
	
	@Override
	public Object invoke(Context context,List<Object> arguments) {
		drawingArea.show();
		return null;
	}

	@Override
	public String getName() {
		return "show";
	}

}
