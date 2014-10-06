package logo.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTextPane;

public class AboutDialog extends AbstractDialog {

	private static final long serialVersionUID = -6259069076710798495L;

	public AboutDialog(JFrame parent) {
		super(parent);
	}
	
	@Override
	protected void buildUI() {
		JTextPane text = new JTextPane();
		text.setEditable(false);
		text.setContentType("text/html");
		text.setText("<html><body><center><h1>About MyLOGO</h1><p>Copyright 2012 Carlos Ernesto Descalzi</p></center></body></html>");
		getBody().setLayout(new BorderLayout());
		getBody().add(text,BorderLayout.CENTER);
		setSize(500,400);
		addCloseAction();
		Dimension screenSize = getToolkit().getScreenSize();
		setLocation((screenSize.width-500)/2,(screenSize.height-400)/2);
	}

}
