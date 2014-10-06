package logo.ui.lnf;

import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicSplitPaneDivider;
import javax.swing.plaf.basic.BasicSplitPaneUI;

public class SplitPaneUI extends BasicSplitPaneUI {

	
	public static ComponentUI createUI(JComponent c){
		return new SplitPaneUI();
	}

	@Override
	public BasicSplitPaneDivider createDefaultDivider() {
		return new Divider(this);
	}

	
	private class Divider extends BasicSplitPaneDivider {

		private static final long serialVersionUID = -4324815896340530840L;

		public Divider(BasicSplitPaneUI ui) {
			super(ui);
			setBorder(null);
		}

		@Override
		public void paint(Graphics g) {
			
			Insets insets = getInsets();
			
			g.drawImage(UIResources.TOOLBAR_BACKGROUND_IMAGE, insets.left, insets.top, 
				getWidth()-(insets.left+insets.right), 
				getHeight()-(insets.top+insets.bottom), 
				this);
		}
		
	}
}
