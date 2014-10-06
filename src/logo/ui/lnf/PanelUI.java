package logo.ui.lnf;

import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.plaf.ComponentUI;


public class PanelUI extends javax.swing.plaf.PanelUI {

	public static ComponentUI createUI(JComponent c){
		return new PanelUI();
	}
	
	@Override
	public void paint(Graphics g, JComponent c) {
		JPanel panel = (JPanel)c;
		
		if (panel.isOpaque()){
			Insets insets = panel.getInsets();
			
			g.drawImage(
				UIResources.TOOLBAR_BACKGROUND_IMAGE, 
				insets.right, 
				insets.bottom, 
				panel.getWidth() - (insets.right + insets.left), 
				panel.getHeight() - (insets.top + insets.bottom), 
				panel);
		}
	}

}
