package logo.functions;

import java.util.List;

import logo.ui.Context;
import logo.ui.DrawingArea;

public class NoShow implements Function {

	private DrawingArea drawingArea;
	
	public NoShow(DrawingArea drawingArea){
		this.drawingArea = drawingArea;
	}
	
	@Override
	public Object invoke(Context context,List<Object> arguments) {
		drawingArea.noShow();
		return null;
	}

	@Override
	public String getName() {
		return "noshow";
	}

}
