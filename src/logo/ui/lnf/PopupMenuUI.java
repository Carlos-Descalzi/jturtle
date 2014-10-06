package logo.ui.lnf;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

import javax.swing.JComponent;
import javax.swing.JPopupMenu;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicPopupMenuUI;

public class PopupMenuUI extends BasicPopupMenuUI {

	public static ComponentUI createUI(JComponent c){
		return new PopupMenuUI();
	}
	
	@Override
	public void installUI(JComponent c) {
		super.installUI(c);
		JPopupMenu popup = (JPopupMenu)c;
		popup.setBorderPainted(false);
		c.addContainerListener(new ContainerListener() {
			
			@Override
			public void componentRemoved(ContainerEvent e) {}
			
			@Override
			public void componentAdded(ContainerEvent e) {
				((JComponent)e.getChild()).setOpaque(false);
				((JComponent)e.getChild()).setForeground(Color.WHITE);
			}
		});
	}

	@Override
	public void paint(Graphics g, JComponent c) {
		g.drawImage(UIResources.TOOLBAR_BACKGROUND_IMAGE, 0, 0, c.getWidth(), c.getHeight(),c);
	}

	
	
}
