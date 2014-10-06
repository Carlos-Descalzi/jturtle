package logo.ui.cl;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import logo.ui.util.ActionFactory;

public class CommandLine extends JPanel{

	private static final long serialVersionUID = -5342889274237012449L;

	private JTextPane log = new JTextPane();
	private JEditorPane input = new JEditorPane();
	private List<String> entries = new ArrayList<String>();
	private int index = -1;
	
	public CommandLine(){
		setLayout(new CommandLineLayout());
		add(log);
		add(input);
		log.setEditorKit(new LogoEditorKit());
		log.setFont(new Font("Monospace",Font.PLAIN,16));
		input.setEditorKit(new LogoEditorKit());
		input.setFont(new Font("Monospace",Font.PLAIN,16));
		log.setEditable(false);
		input.setOpaque(false);
		log.setOpaque(false);
		setOpaque(false);
		input.getActionMap().put("enter", ActionFactory.create(this, "handleCommand"));
		input.getActionMap().put("prevLine", ActionFactory.create(this, "prevLine"));
		input.getActionMap().put("nextLine", ActionFactory.create(this, "nextLine"));
		input.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0), "enter");
		input.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_UP,0), "prevLine");
		input.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN,0), "nextLine");
	}
	
	public void error(String error){
		error+="\n";
		SimpleAttributeSet set = new SimpleAttributeSet();
		StyleConstants.setForeground(set, Color.RED);
		StyleConstants.setBold(set, true);
		StyleConstants.setFontSize(set, 14);

		set.addAttribute("preformatted", true);
		try {
			log.getDocument().insertString(log.getSelectionEnd(), error, set);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}
	
	public void handleCommand(){
		String text = input.getText();
		try {
			log.getDocument().insertString(log.getSelectionEnd(), text+"\n", new SimpleAttributeSet());
		} catch (BadLocationException e1) {
			e1.printStackTrace();
		}
		input.setText("");
		entries.add(0,text);
		index = -1;
		if (!text.trim().equals("")){
			fire(text);
		}
	}
	
	public void prevLine(){
		index++;
		
		if (index < entries.size()){
			input.setText(entries.get(index));
		} else {
			index = entries.size()-1;
		}
	}
	
	public void nextLine(){
		index--;
		
		if (index >=0){
			input.setText(entries.get(index));
		} else {
			index = 0;
		}
	}

	private transient List<CommandLineListener> listeners = null;

	public synchronized void addCommandLineListener(CommandLineListener listener){
		
		List<CommandLineListener> listeners = new ArrayList<CommandLineListener>();
		if (this.listeners != null){
			listeners.addAll(this.listeners);
		}
		if (!listeners.contains(listener)){
			listeners.add(listener);
		}
		this.listeners = listeners;
		
	}
	
	public synchronized void removeCommandLineListener(CommandLineListener listener){
		if (this.listeners != null && this.listeners.contains(listener)){
			List<CommandLineListener> listeners = new ArrayList<CommandLineListener>(this.listeners);
			listeners.remove(listener);
			this.listeners = listeners;
		}
	}
	
	private void fire(String command){
		if (listeners != null){
			CommandLineEvent event = new CommandLineEvent(this,command);
			for (CommandLineListener listener: new ArrayList<CommandLineListener>(this.listeners)){
				listener.newCommand(event);
			}
		}
	}

	private class CommandLineLayout implements LayoutManager {

		@Override
		public void addLayoutComponent(String name, Component comp) {}

		@Override
		public void removeLayoutComponent(Component comp) {}

		@Override
		public Dimension preferredLayoutSize(Container parent) {
			int height = (getLineCount(log.getText())+1) * 22;
			return new Dimension(100,height);
		}

		@Override
		public Dimension minimumLayoutSize(Container parent) {
			int height = (getLineCount(log.getText())+1) * 22;
			return new Dimension(100,height);
		}

		@Override
		public void layoutContainer(Container parent) {
			Insets insets = parent.getInsets();
			int height = getLineCount(log.getText()) * 20;
			log.setLocation(insets.left,insets.top);
			log.setSize(parent.getWidth()-(insets.left+insets.right),height);
			input.setLocation(insets.left,height+1+insets.top);
			input.setSize(parent.getWidth(),22);
		}

		private int getLineCount(String text) {
			int count = 0;
			for (String line:text.split("\n")){
				if (!line.equals("")){
					count++;
				}
			}
			return count;
		}		
	}
}
