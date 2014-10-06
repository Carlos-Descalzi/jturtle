package logo.ui.cl;

import java.util.EventObject;

public class CommandLineEvent extends EventObject {

	private static final long serialVersionUID = 5300026102495139992L;

	private String command;
	
	public CommandLineEvent(Object source,String command) {
		super(source);
		this.command = command;
	}
	
	public String getCommand() {
		return command;
	}

}
