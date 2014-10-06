package logo.ui.lnf;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;

public class ButtonUI extends javax.swing.plaf.basic.BasicButtonUI {

	@Override
	public void installUI(JComponent c) {
		super.installUI(c);
		c.setPreferredSize(new Dimension(64,64));
		c.setMinimumSize(new Dimension(64,64));
		c.setMaximumSize(new Dimension(64,64));
		c.setSize(new Dimension(64,64));
		JButton b = (JButton)c;
		b.setBorderPainted(false);
		b.setFocusPainted(false);
		b.setOpaque(false);
		b.setMargin(new Insets(0,0,0,0));
		b.setBorder(null);
	}

	@Override
	public void paint(Graphics g, JComponent c) {
		JButton button = (JButton)c;
		ButtonModel model = button.getModel();
		Insets insets = button.getInsets();
		if (model.isPressed()){
			g.drawImage(UIResources.PRESSED_ROUND_BUTTON_IMAGE, insets.left,insets.top, c);
		} else {
			g.drawImage(UIResources.ROUND_BUTTON_IMAGE, insets.left,insets.top, c);
		}
		Icon icon = button.getIcon();
		
		if (icon != null){
			int dx = insets.left + ((c.getWidth() - (insets.left+insets.right))-icon.getIconWidth())/2;
			int dy = insets.top + ((c.getHeight() - (insets.top+insets.bottom))-icon.getIconHeight())/2;
			icon.paintIcon(c, g, dx, dy);
		}
	}

}
