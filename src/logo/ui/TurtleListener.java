package logo.ui;

import java.util.EventListener;

public interface TurtleListener 
	extends EventListener{

	public void rotatedLeft(TurtleEvent event);
	public void rotatedRight(TurtleEvent event);
	public void movedForward(TurtleEvent event);
	public void movedBackward(TurtleEvent event);
	public void beganDrawing(TurtleEvent event);
	public void endDrawing(TurtleEvent event);
}
