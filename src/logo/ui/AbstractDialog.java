package logo.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

import logo.ui.util.ActionFactory;

public abstract class AbstractDialog 
	extends JDialog {

	private static final long serialVersionUID = 158490621959530458L;
	
	private JPanel body = new JPanel();
	private JPanel buttonBar = new JPanel(new FlowLayout(FlowLayout.RIGHT));

	private Action closeAction = ActionFactory.create(this, "close","Close");

	public AbstractDialog(JFrame parent){
		super(parent,"",true);
		setLayout(new BorderLayout());
		
		add(body,BorderLayout.CENTER);
		add(buttonBar,BorderLayout.SOUTH);
		
		buildUI();
	}
	
	public void close(){
		setVisible(false);
	}
	
	protected JPanel getBody(){
		return body;
	}
	
	protected void addAction(Action action){
		addAction(action,true);
	}
	
	protected void addCloseAction(){
		addAction(closeAction);
	}
	
	protected void addAction(Action action, boolean after){
		JButton actionButton = new JButton(action);
		if (after){
			buttonBar.add(actionButton);
		} else {
			buttonBar.add(actionButton,buttonBar.getComponentCount()-1);
		}
	}
	
	protected abstract void buildUI();

}
