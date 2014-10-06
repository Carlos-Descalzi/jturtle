package logo.ui.cl;

import javax.swing.JEditorPane;

public class ProgramEditor extends JEditorPane {

	private static final long serialVersionUID = -7320829986256809882L;

	public ProgramEditor(){
		setEditorKit(new LogoEditorKit());
		setOpaque(true);
	}
}
