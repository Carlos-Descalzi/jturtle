package logo.ui.lnf;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class UIResources {

	public static BufferedImage ROUND_BUTTON_IMAGE;
	public static BufferedImage PRESSED_ROUND_BUTTON_IMAGE;
	public static BufferedImage TOOLBAR_BACKGROUND_IMAGE;
	public static BufferedImage MENUBAR_BACKGROUND_IMAGE;
	static {
		try {
			ROUND_BUTTON_IMAGE = ImageIO.read(UIResources.class.getResource("/button.png"));
			PRESSED_ROUND_BUTTON_IMAGE = ImageIO.read(UIResources.class.getResource("/button-pressed.png"));
			TOOLBAR_BACKGROUND_IMAGE = ImageIO.read(UIResources.class.getResource("/halfbarbottom.png"));
			MENUBAR_BACKGROUND_IMAGE = ImageIO.read(UIResources.class.getResource("/halfbartop.png"));
		}catch(Exception ex){
			
		}
	}
}
