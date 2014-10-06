package logo.functions;

import java.util.List;

import logo.ui.Context;
import logo.ui.DrawingArea;

public class Write implements Function {

	private DrawingArea drawingArea;
	
	public Write(DrawingArea drawingArea){
		this.drawingArea = drawingArea;
	}
	
	@Override
	public Object invoke(Context context,List<Object> arguments) {
		drawingArea.write(arguments.get(0));
		return null;
	}

	@Override
	public String getName() {
		return "write";
	}

}
