package logo.ui.cl;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import logo.parser.LogoLexer;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.Token;

public class LogoDocument extends  DefaultStyledDocument {

	private static final long serialVersionUID = -5965049277607984562L;

	private static final Set<String> endOfTokens = new HashSet<String>(Arrays.asList("\t"," ","\n","\r"));
	
	private File file;
	private boolean dirty;
	
	private List<LogoDocumentListener> listeners = new ArrayList<LogoDocumentListener>();
	
	public static LogoDocument fromFile(File file)
		throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader(file));
		
		LogoDocument document = new LogoDocument();
		for (String line = reader.readLine(); line != null;line = reader.readLine()){
			try {
				document.insertString(document.getLength(),line+"\r\n",new SimpleAttributeSet());
			} catch (BadLocationException e) {
				e.printStackTrace();
			}
		}
		document.file = file;
		document.dirty = false;
		reader.close();
		
		return document;
	}
	
	
	public LogoDocument(){
	}
	
	public void setFile(File file){
		this.file = file;
	}
	
	public File getFile(){
		return file;
	}
	
	public boolean isDirty(){
		return dirty;
	}
	
	public void save() throws IOException{
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		try {
			writer.append(getText(0,getLength()));
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
		writer.flush();
		writer.close();
		dirty = false;
		fireDocumentSaved(file);
	}


	@Override
	public void insertString(int offs, String str, AttributeSet a)
			throws BadLocationException {
		try {
			
			super.insertString(offs, str, a);
			
			if (Boolean.TRUE.equals(a.getAttribute("preformatted"))){
				return;
			}
			
			int start = getStart(offs);
			int end = getEnd(offs+str.length());
			
			String text = getText(start,end-start);
			
			LogoLexer lexer = new LogoLexer(new ANTLRStringStream(text));
			lexer.reset();
			Token token = lexer.nextToken();
			Token previous = null;
			while (token.getType() != Token.EOF){
				Color color = Color.WHITE;
				switch (token.getType()){
				case LogoLexer.AND:
				case LogoLexer.OR:
				case LogoLexer.XOR:
				case LogoLexer.TO:
				case LogoLexer.END:
				case LogoLexer.MAKE:
				case LogoLexer.REPEAT:
				case LogoLexer.IF:
					color = new Color(1f,0.4f,0.4f);
					break;
				case LogoLexer.ID:
					if (previous != null && previous.getType() == LogoLexer.COLON){
						color = new Color(1f,0.5f,1f);
					} else {
						color = new Color(0.4f,1,0.4f);
					}
					break;
				case LogoLexer.COLON:
					color = new Color(1f,0.5f,1f);
					break;
				case LogoLexer.STRING:
				case LogoLexer.INT:
				case LogoLexer.FLOAT:
					color = Color.CYAN.brighter();
					break;
					
				case LogoLexer.OPEN_BR:
				case LogoLexer.CLOSE_BR:
				case LogoLexer.OPEN_PAR:
				case LogoLexer.CLOSE_PAR:
				case LogoLexer.PLUS:
				case LogoLexer.MINUS:
				case LogoLexer.MULT:
				case LogoLexer.DIV:
					color = Color.YELLOW.brighter();
					break;
				}
				
				setColor(start+token.getCharPositionInLine(),token.getText().length(),color);
				previous = token;
				token = lexer.nextToken();
			}
		}catch (Exception ex){
			ex.printStackTrace();
		}
		if (!dirty){
			dirty = true;
			fireDocumentChanged();
		}
	}
	
	private void setColor(int start, int length, Color color) {
		SimpleAttributeSet attr = new SimpleAttributeSet();
		StyleConstants.setForeground(attr, color);
		StyleConstants.setBold(attr, true);
		StyleConstants.setFontSize(attr, 14);
		setCharacterAttributes(start, length, attr, false);
	}
	
	private int getEnd(int offs) throws BadLocationException {
		int length = getLength();
		for (int i=offs;i<length;i++){
			char c = getText(i, 1).charAt(0);
			if (c == ' ' || c == '\t' || c == '\n'){
				return i;
			}
		}
		return length;
	}

	private int getStart(int offs) throws BadLocationException {
		for (int i=offs;i>=0;i--){
			if (endOfTokens.contains(getText(i, 1))){
				return i+1;
			}
		}
		return 0;
	}
	
	public void addLogoDocumentListener(LogoDocumentListener listener){
		listeners.add(listener);
	}
	
	public void removeLogoDocumentListener(LogoDocumentListener listener){
		listeners.remove(listener);
	}
	
	private void fireDocumentChanged(){
		LogoDocumentEvent event = new LogoDocumentEvent(this); 
		for (LogoDocumentListener listener:new ArrayList<LogoDocumentListener>(listeners)){
			listener.documentChanged(event);
		}
	}
	
	private void fireDocumentSaved(File file) {
		LogoDocumentEvent event = new LogoDocumentEvent(this,file); 
		for (LogoDocumentListener listener:new ArrayList<LogoDocumentListener>(listeners)){
			listener.documentChanged(event);
		}
	}

}
