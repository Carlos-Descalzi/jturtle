package logo.ui.cl;

import java.util.EventListener;

public interface LogoDocumentListener 
	extends EventListener{

	public void documentChanged(LogoDocumentEvent evnet);
	public void docuemntSaved(LogoDocumentEvent event);
}
