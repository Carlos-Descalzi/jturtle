package logo.ui.lnf;

import java.awt.Color;

import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicMenuUI;

public class MenuUI extends BasicMenuUI {


	public static ComponentUI createUI(JComponent c){
		return new MenuUI();
	}
	

	@Override
	public void installUI(JComponent c) {
		super.installUI(c);
		JMenu menu = (JMenu)c;
		menu.setForeground(Color.WHITE);
	}

}
