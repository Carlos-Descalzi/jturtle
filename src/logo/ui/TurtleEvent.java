package logo.ui;

import java.util.EventObject;

public class TurtleEvent 
	extends EventObject {

	private static final long serialVersionUID = 5630741199917370527L;

	private double amount;
	
	public TurtleEvent(Object source) {
		this(source,0);
	}

	public TurtleEvent(Object source,double amount) {
		super(source);
	}
	
	public double getAmount(){
		return amount;
	}

}
