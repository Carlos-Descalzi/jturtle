package logo.ui.lnf;

import static java.awt.Color.WHITE;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.geom.RoundRectangle2D;
import java.util.Arrays;

import javax.swing.UIDefaults;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalLookAndFeel;


public class LnF extends MetalLookAndFeel {

	private static final long serialVersionUID = 1771556553922836811L;

	private static final Color COLOR1 = new Color(0x2fd0d1);
	private static final Color COLOR2 = COLOR1.darker().darker();

	
	private static class LnfTheme extends DefaultMetalTheme {

		private static final ColorUIResource COLOR1R = new ColorUIResource(COLOR1);
		private static final ColorUIResource COLOR2R = new ColorUIResource(COLOR2);
		
		public ColorUIResource getControl(){
			return COLOR1R;
		}
	    public ColorUIResource getControlShadow() { 
	    	return COLOR2R; 
	    }
	    public ColorUIResource getPrimaryControlShadow() { 
	    	return COLOR2R; 
	    }
		public ColorUIResource getPrimaryControlDarkShadow(){
			return COLOR2R;
		}
	    public ColorUIResource getPrimaryControl() { 
	    	return COLOR1R; 
	    }
	    public ColorUIResource getSystemTextColor() { 
	    	return COLOR2R; 
	    }

	    
	}
	
	
	private LnfTheme theme = new LnfTheme();
	
	public LnF(){
	}
	
	@Override
	protected void initClassDefaults(UIDefaults table) {
		super.initClassDefaults(table);
//		table.put("ToolBarUI",ToolBarUI.class.getName());
//		table.put("MenuBarUI",MenuBarUI.class.getName());
//		table.put("MenuUI",MenuUI.class.getName());
//		table.put("PopupMenuUI",PopupMenuUI.class.getName());
//		table.put("PanelUI",PanelUI.class.getName());
//		table.put("SplitPaneUI",SplitPaneUI.class.getName());
	}

	@Override
	protected void initComponentDefaults(UIDefaults table) {
		super.initComponentDefaults(table);
		
		table.put("ToolBar.background", COLOR1);
		table.put("ToolBar.opaque",true);
		table.remove("ToolBar.border");
		table.put("MenuBar.background", COLOR1);
		table.put("MenuBar.foreground", WHITE);
		table.remove("MenuBar.border");
		table.put("PopUpMenu.foreground", WHITE);
		table.put("Menu.borderPainted",false);
		table.put("Menu.background", COLOR1);
		table.put("Menu.foreground", WHITE);
        table.put("Menu.selectionBackground", WHITE);
        table.put("Menu.selectionForeground", COLOR1);
		table.remove("Menu.border");
		table.put("MenuItem.background", COLOR1);
		table.put("MenuItem.foreground", WHITE);
		table.put("MenuItem.borderPainted",false);
        table.put("MenuItem.selectionBackground", WHITE);
        table.put("MenuItem.selectionForeground", COLOR1);
        table.put("Separator.foreground", COLOR1);
   		table.put("Separator.background", WHITE);
   		table.put("SplitPane.dividerSize", 5);
   		table.put("SplitPane.background",WHITE);
   		table.put("SplitPane.foreground",COLOR1);
   		table.put("SplitPane.borderPainted",false);
   		table.put("SplitPane.shadow", COLOR1);
   		table.remove("SplitPane.border");
   		
   		table.remove("SplitPaneDivider.border");
   		
   		table.put("SplitPaneDivider.background",WHITE);
   		table.put("SplitPaneDivider.foreground",COLOR1);
   		
   		table.put("SplitPane.shadow", COLOR1);
   		table.put("SplitPane.darkShadow", COLOR1);

   		table.put("Panel.background", COLOR1);
   		table.put("Panel.foreground", WHITE);
   		table.put("Label.foreground", WHITE);
   		
   		table.put("Button.background", COLOR1);
   		table.put("Button.foreground", WHITE);
   		table.put("Button.border", new CompoundBorder(new RoundedBorder(WHITE),new EmptyBorder(2, 2, 2, 2)));

   		table.put("ToggleButton.background", COLOR1);
   		table.put("ToggleButton.foreground", WHITE);
   		table.put("ToggleButton.border", new CompoundBorder(new RoundedBorder(WHITE),new EmptyBorder(2, 2, 2, 2)));
   		
   		table.put("TextField.background", WHITE);
   		table.put("TextField.foreground", COLOR2);
   		table.put("TextField.border",new EmptyBorder(1,1,1,1));
   		
   		table.put("ComboBox.background", WHITE);
   		table.put("ComboBox.foreground", COLOR2);
   		table.put("ComboBox.selectionBackground", COLOR1);
   		table.put("ComboBox.selectionForeground", WHITE);
   		table.put("ComboBox.border",new EmptyBorder(1,1,1,1));
   		
   		table.put("ScrollBar.background", WHITE);
   		table.put("ScrollBar.foreground", COLOR1);
   		table.put("ScrollBar.gradient",Arrays.asList(COLOR1,COLOR1));
   		table.put("ScrollBar.thumb", COLOR1);
   		table.put("ScrollBar.shadow",COLOR1);
   		table.put("ScrollBar.highlight",WHITE);
   		table.put("ScrollBar.thumbHighlight",COLOR1);
   		table.put("ScrollBar.thumbShadow", COLOR1);
   		table.put("ScrollBar.thumb",COLOR1);
   		
   		table.put("Viewport.background", COLOR2);
   		table.put("Viewport.foreground", WHITE);
   		
   		table.put("EditorPane.background", COLOR2);
   		table.put("EditorPane.foreground", WHITE);
   		
   		table.remove("ScrollPane.border");

   		table.put("TitledBorder.titleColor", WHITE);
   		table.put("Separator.foreground",WHITE);
   		table.put("Separator.background",WHITE);
	}

	
	private static class RoundedBorder implements Border {
		private Color color;
		
		public RoundedBorder(Color color){
			this.color = color;
		}

		@Override
		public void paintBorder(Component c, Graphics g, int x, int y,
				int width, int height) {
			
			RoundRectangle2D r = new RoundRectangle2D.Double(x+1, y+1, width-3, height-3, 5, 5);
			
			((Graphics2D)g).setStroke(new BasicStroke(2));
			((Graphics2D)g).setColor(color);
			((Graphics2D)g).draw(r);
			
		}

		@Override
		public Insets getBorderInsets(Component c) {
			return new Insets(5,5,5,5);
		}

		@Override
		public boolean isBorderOpaque() {
			return false;
		}
		
	}
	
	@Override
	public void initialize() {
		super.initialize();
		setCurrentTheme(theme);
	}

	@Override
	protected void initSystemColorDefaults(UIDefaults table) {
		super.initSystemColorDefaults(table);
	}

	@Override
	public String getDescription() {
		return "Logo LNF";
	}

	@Override
	public String getID() {
		return "LogoLNF";
	}

	@Override
	public String getName() {
		return "Logo LNF";
	}

	@Override
	public boolean isNativeLookAndFeel() {
		return false;
	}

	@Override
	public boolean isSupportedLookAndFeel() {
		return true;
	}

}
