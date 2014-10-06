package logo.ui.cl;

import java.util.EventListener;

public interface CommandLineListener extends EventListener {

	public void newCommand(CommandLineEvent event);
}
