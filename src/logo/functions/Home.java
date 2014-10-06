package logo.functions;

import java.util.List;

import logo.ui.Context;
import logo.ui.DrawingArea;

public class Home implements Function {

	private DrawingArea drawingArea;
	
	public Home(DrawingArea drawingArea){
		this.drawingArea = drawingArea;
	}
	
	@Override
	public Object invoke(Context context,List<Object> arguments) {
		drawingArea.goHome();
		return null;
	}

	@Override
	public String getName() {
		return "home";
	}

}
