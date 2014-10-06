package logo.ui.cl;

import java.io.File;
import java.util.EventObject;

public class LogoDocumentEvent extends EventObject {

	private static final long serialVersionUID = -1480673365527546206L;
	private File file;

	public LogoDocumentEvent(Object source) {
		this(source,null);
	}

	public LogoDocumentEvent(Object source, File file) {
		super(source);
		this.file = file;
	}

	public File getFile() {
		return file;
	}

}
