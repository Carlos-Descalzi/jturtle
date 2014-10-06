package logo.ui.lnf;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JToolBar;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicToolBarUI;

public class ToolBarUI extends BasicToolBarUI
	implements ContainerListener{

	private final ButtonUI buttonUI = new ButtonUI();
	
	public static ComponentUI createUI(JComponent c){
		return new ToolBarUI();
	}
	
	@Override
	public void installUI(JComponent c) {
		super.installUI(c);
		
		((JToolBar)c).setFloatable(false);
		((JToolBar)c).setBorderPainted(false);
		
		c.setMaximumSize(new Dimension(Integer.MAX_VALUE,Integer.MAX_VALUE));
		c.setMinimumSize(new Dimension(64,64));
		c.setPreferredSize(new Dimension(64,64));
		c.addContainerListener(this);
	}

	@Override
	public void componentAdded(ContainerEvent event) {
		if (event.getChild() instanceof JButton){
			((JButton)event.getChild()).setUI(buttonUI);
		}
	}

	@Override
	public void componentRemoved(ContainerEvent event) {
		
	}

	@Override
	public void uninstallUI(JComponent c) {
		super.uninstallUI(c);
		c.removeContainerListener(this);
	}

	@Override
	public void paint(Graphics g, JComponent c) {
		g.drawImage(UIResources.TOOLBAR_BACKGROUND_IMAGE, 0, 0, c.getWidth(),c.getHeight(), c);
	}
	
	
}
