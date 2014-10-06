package logo.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import logo.ui.Context;
import logo.ui.DrawingArea;

public class Color implements Function {

	private DrawingArea drawingArea;
	
	public Color(DrawingArea drawingArea){
		this.drawingArea = drawingArea;
	}
	
	@Override
	public Object invoke(Context context,List<Object> arguments) {
		
		java.awt.Color color = drawingArea.getColor();
		
		if (arguments.size() == 3){
			drawingArea.color(
				(Integer)arguments.get(0),
				(Integer)arguments.get(1),
				(Integer)arguments.get(2));
		}
		return new ArrayList(Arrays.asList(color.getRed(),color.getGreen(),color.getBlue()));
	}

	@Override
	public String getName() {
		return "color";
	}

}
