package logo.ui.lnf;

import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JMenuBar;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicMenuBarUI;

public class MenuBarUI extends BasicMenuBarUI{

	public static ComponentUI createUI(JComponent c){
		return new MenuBarUI();
	}
	
	@Override
	public void installUI(JComponent c) {
		super.installUI(c);
		((JMenuBar)c).setBorderPainted(false);

	}

	@Override
	public void paint(Graphics g, JComponent c) {
		g.drawImage(UIResources.MENUBAR_BACKGROUND_IMAGE, 0, 0, c.getWidth(),c.getHeight(), c);
	}
	
	
}
