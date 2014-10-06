package logo.ui;

import java.awt.Color;

import javax.swing.JEditorPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class LogView 
	extends JEditorPane{

	private static final long serialVersionUID = 1L;

	public LogView(){
		setDocument(new DefaultStyledDocument());
		setOpaque(true);
	}
	
	public void error(String error){
		error+="\n";
		SimpleAttributeSet set = new SimpleAttributeSet();
		StyleConstants.setForeground(set, Color.RED);
		
		try {
			getDocument().insertString(getSelectionEnd(), error, set);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}
}
