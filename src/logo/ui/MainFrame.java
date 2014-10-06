package logo.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.JobAttributes;
import java.awt.PageAttributes;
import java.awt.PrintJob;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.IOException;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.text.Document;

import logo.functions.Backward;
import logo.functions.BeginFill;
import logo.functions.Clear;
import logo.functions.Color;
import logo.functions.Cos;
import logo.functions.Debug;
import logo.functions.Draw;
import logo.functions.EndFill;
import logo.functions.Forward;
import logo.functions.GoTo;
import logo.functions.Home;
import logo.functions.Left;
import logo.functions.NoDraw;
import logo.functions.NoShow;
import logo.functions.Pow;
import logo.functions.Right;
import logo.functions.Show;
import logo.functions.Sin;
import logo.functions.Sleep;
import logo.functions.Tan;
import logo.functions.Write;
import logo.parser.LogoLexer;
import logo.parser.LogoParser;
import logo.ui.cl.CommandLine;
import logo.ui.cl.CommandLineEvent;
import logo.ui.cl.CommandLineListener;
import logo.ui.cl.LogoDocument;
import logo.ui.cl.LogoDocumentEvent;
import logo.ui.cl.LogoDocumentListener;
import logo.ui.cl.ProgramEditor;
import logo.ui.lnf.LnF;
import logo.ui.util.ActionFactory;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

public class MainFrame 
	extends JFrame
	implements ErrorReporter,
		ClipboardOwner, 
		CommandLineListener, 
		LogoDocumentListener{

	private static final long serialVersionUID = -7721156842833603621L;

	private DrawingArea drawingArea = new DrawingArea();
	private ProgramEditor programEditor = new ProgramEditor();
	private JFileChooser fileChooser = new JFileChooser();
	private CommandLine logView = new CommandLine();
	private Action newAction = ActionFactory.create(this,"newProgram","New","/new.png");
	private Action openAction = ActionFactory.create(this,"openProgram","Open","/open.png");
	private Action saveAction = ActionFactory.create(this,"saveProgram","Save","/save.png");
	private Action saveAsAction = ActionFactory.create(this,"saveProgramAs","Save As","/save.png");
	private Action exitAction = ActionFactory.create(this,"exit","Exit","/exit.png");
	private Action cutAction = ActionFactory.create(this,"cut","Cut","/cut.png");
	private Action copyAction = ActionFactory.create(this,"copy","Copy","/copy.png");
	private Action copyImageAction = ActionFactory.create(this,"copyImage","Copy Image","/copy.png");
	private Action pasteAction = ActionFactory.create(this,"paste","Paste","/paste.png");
	private Action printAction = ActionFactory.create(this,"printImage","Print","/print.png");
	private Action runAction = ActionFactory.create(this,"run","Run","/run.png");
	private Action showAboutDialogAction = ActionFactory.create(this,"showAboutDialog","About");
	private AboutDialog aboutDialog = new AboutDialog(this);
	
	private ContextImpl context;
	private LogoParser parser;

	public static void main(String[] args) throws Exception{
		UIManager.setLookAndFeel(LnF.class.getName());
		MainFrame mainFrame = new MainFrame();
		mainFrame.setVisible(true);
	}

	public MainFrame() throws Exception{
		setTitle("LOGO");
		buildUI();
		buildMenuBar();
		buildContext();	
		parser = new LogoParser(null);
		parser.setContext(context);
		fileChooser.setFileFilter(new FileFilter(){

			@Override
			public boolean accept(File f) {
				return f.isDirectory() || f.getName().toLowerCase().endsWith(".logo");
			}

			@Override
			public String getDescription() {
				return "Logo program";
			}
			
		});
	}
	
	private LogoDocument getProgram(){
		return (LogoDocument)programEditor.getDocument();
	}
	
	private void setProgram(LogoDocument program){
		Document document = programEditor.getDocument();
		if (document != null && document instanceof LogoDocument){
			((LogoDocument)document).removeLogoDocumentListener(this);
		}
		programEditor.setDocument(program);
		if (program != null){
			program.addLogoDocumentListener(this);
		}
		updateTitle();
	}
	
	public void newProgram() {
		if (doSaveBeforeOpenOrNew()){
			setProgram(new LogoDocument());
		}
	}
	
	private boolean doSaveBeforeOpenOrNew(){
		LogoDocument program = getProgram();
		if (program.isDirty()){
			int option = JOptionPane.showConfirmDialog(this, "Hay cosas sin guardar, desea guardar ahora?", "Atencion", JOptionPane.YES_NO_CANCEL_OPTION);

			if (option == JOptionPane.CANCEL_OPTION){
				return false;
			} else if (option == JOptionPane.YES_OPTION){
				saveProgram();
			} 
		} 
		return true;
	}

	public void openProgram() {
		if (doSaveBeforeOpenOrNew()){
			int option = fileChooser.showOpenDialog(this);
			
			if (option == JFileChooser.APPROVE_OPTION){
				File file = fileChooser.getSelectedFile();
				
				try {
					LogoDocument program = LogoDocument.fromFile(file);
					setProgram(program);
				}catch (IOException ex){
					ex.printStackTrace();
				}
			}
		}
	}

	public void saveProgram() {
		LogoDocument program = getProgram();
		File file = program.getFile();
		if (file == null){
			file = askForFileName();
			program.setFile(file);
		}
		if (file != null){
			try {
				program.save();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void saveProgramAs(){
		File file = askForFileName();
		if (file != null){
			LogoDocument program = getProgram();
			program.setFile(file);
			try {
				program.save();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private File askForFileName() {
		
		while (true){
			int option = fileChooser.showSaveDialog(this);
			if (option == JFileChooser.APPROVE_OPTION){
				File file = fileChooser.getSelectedFile();
				
				if (file.exists()){
					if (JOptionPane.showConfirmDialog(this, "El archivo ya existe, desea sobreescribir?") == JOptionPane.YES_OPTION){
						return file;
					}
				} else {
					return file;
				}
			} else if (option == JFileChooser.CANCEL_OPTION){
				return null;
			}
		}
	}

	public void cut() {
	}

	public void paste() {
	}

	public void copy() {
	}

	public void updateUIState(){
		
	}

	private JButton makeButton(Action action){
		JButton b = new JButton(action);
		b.setPressedIcon((Icon)action.getValue(ActionFactory.CLICKED_ICON));
		b.setHideActionText(true);
		b.setPreferredSize(new Dimension(64,64));
		b.setBorderPainted(false);
		b.setContentAreaFilled(false);
		b.setFocusPainted(false);
		return b;
	}
	private void buildMenuBar(){
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		toolBar.add(makeButton(newAction));
		toolBar.add(makeButton(openAction));
		toolBar.add(makeButton(saveAction));
		toolBar.add(makeButton(printAction));
		
		toolBar.addSeparator();
		toolBar.add(makeButton(cutAction));
		toolBar.add(makeButton(copyAction));
		toolBar.add(makeButton(pasteAction));
		toolBar.add(makeButton(copyImageAction));
		
		toolBar.addSeparator();
		toolBar.add(makeButton(runAction));
		
		toolBar.addSeparator();
		toolBar.add(makeButton(exitAction));
		add(toolBar,BorderLayout.NORTH);
		
		JMenuBar menuBar = new JMenuBar();

		JMenu fileMenu = new JMenu("File");
		menuBar.add(fileMenu);
		fileMenu.add(newAction);
		fileMenu.add(openAction);
		fileMenu.add(saveAction);
		fileMenu.add(saveAsAction);
		fileMenu.addSeparator();
		fileMenu.add(printAction);
		fileMenu.addSeparator();
		fileMenu.add(exitAction);
		
		JMenu editMenu = new JMenu("Edit");
		menuBar.add(editMenu);
		editMenu.add(cutAction);
		editMenu.add(copyAction);
		editMenu.add(pasteAction);
		
		JMenu helpMenu = new JMenu("Help");
		menuBar.add(helpMenu);
		helpMenu.add(showAboutDialogAction);
		setJMenuBar(menuBar);
	}
	
	private void buildContext() {
		context = new ContextImpl();
		context.addFunction(new Forward(drawingArea));
		context.addFunction(new Backward(drawingArea));
		context.addFunction(new Left(drawingArea));
		context.addFunction(new Right(drawingArea));
		context.addFunction(new Color(drawingArea));
		context.addFunction(new Home(drawingArea));
		context.addFunction(new Write(drawingArea));
		context.addFunction(new Show(drawingArea));
		context.addFunction(new NoShow(drawingArea));
		context.addFunction(new Clear(drawingArea));
		context.addFunction(new Debug(logView));
		context.addFunction(new BeginFill(drawingArea));
		context.addFunction(new EndFill(drawingArea));
		context.addFunction(new Draw(drawingArea));
		context.addFunction(new NoDraw(drawingArea));
		context.addFunction(new Sleep());
		context.addFunction(new Cos());
		context.addFunction(new Sin());
		context.addFunction(new Tan());
		context.addFunction(new Pow());
		context.addFunction(new GoTo(drawingArea));
		context.setErrorReporter(this);
	}

	private void buildUI() {
		setSize(800,600);
		setExtendedState(MAXIMIZED_BOTH);
		Dimension screenSize = getToolkit().getScreenSize();
		setLayout(new BorderLayout());
		JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		split.setRightComponent(new JScrollPane(drawingArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));

		JPanel right = new JPanel(new BorderLayout());
		
		JSplitPane rightSplit = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		
		
		rightSplit.setTopComponent(wrap(programEditor,"Program"));
		rightSplit.setBottomComponent(wrap(logView,"Command Line"));
		
		right.add(rightSplit,BorderLayout.CENTER);
		
		split.setLeftComponent(right);
		add(split,BorderLayout.CENTER);
		rightSplit.setDividerLocation((int)(screenSize.height * 0.7));
		split.setDividerLocation((int)(screenSize.width * 0.35));
		logView.addCommandLineListener(this);
		
	}
	
	private JComponent wrap(JComponent component,String title){
		
		JPanel panel = new JPanel(new BorderLayout());
		panel.setBorder(new TitledBorder(new EmptyBorder(1,1,1,1),title));
		panel.add(new JScrollPane(component,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED),BorderLayout.CENTER);
		return panel;
	}
	
	@Override
	public void reportError(String message) {
		logView.error(message);
	}
	
	public void exit(){
		System.exit(0);
	}
	
	public void run(){
		runAction.setEnabled(false);
		String program = programEditor.getText();
		if (!program.endsWith("\n")){
			program+="\n";
		}
		final String _program = program;
		new Thread(){
			public void run(){
				LogoLexer lexer = new LogoLexer();
				lexer.setCharStream(new ANTLRStringStream(_program));
				parser.setTokenStream(new CommonTokenStream(lexer));
				try {
					parser.program();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} finally {
					SwingUtilities.invokeLater(new Runnable(){
						public void run(){
							runAction.setEnabled(true);
						}
					});
				}
			}
		}.start();
	}
	
	@Override
	public void newCommand(CommandLineEvent event) {
		final String _program = event.getCommand()+"\n";
		new Thread(){
			public void run(){
				LogoLexer lexer = new LogoLexer();
				lexer.setCharStream(new ANTLRStringStream(_program));
				parser.setTokenStream(new CommonTokenStream(lexer));
				try {
					parser.program();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} finally {
					SwingUtilities.invokeLater(new Runnable(){
						public void run(){
							runAction.setEnabled(true);
						}
					});
				}
			}
		}.start();
	}

	public void printImage(){
		JobAttributes jobAttr = new JobAttributes();
		PageAttributes attr = new PageAttributes();
		attr.setPrinterResolution(300);
		PrintJob job = getToolkit().getPrintJob(this, "Logo", jobAttr, attr);
		drawingArea.drawImageOn(job.getGraphics());
		job.end();
	}
	
	public void copyImage(){

		try {
			getToolkit().getSystemClipboard().setContents(
				new ImageTransferable(drawingArea.getImage()), 
				this);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void lostOwnership(Clipboard clipboard, Transferable contents) {
	}
	
	public void showAboutDialog(){
		aboutDialog.setVisible(true);
	}

	@Override
	public void documentChanged(LogoDocumentEvent evnet) {
		updateTitle();
	}

	@Override
	public void docuemntSaved(LogoDocumentEvent event) {
		updateTitle();
	}
	
	private void updateTitle(){
		File file = getProgram().getFile();
		String title;
		if (file != null){
			title = file.getName();
		} else {
			title = "Unsaved Program";
		}
		if (getProgram().isDirty()){
			title+=" *";
		}
		setTitle("LOGO - "+title);
	}
}
