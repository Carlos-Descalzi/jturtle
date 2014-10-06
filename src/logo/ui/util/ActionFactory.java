package logo.ui.util;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;

public class ActionFactory {

	public static final String CLICKED_ICON = "clickedIcon"; 

	public static Action create(Object target,String method){
		return new InvokerAction(method,null,null,target,method);
	}

	
	public static Action create(Object target,String method,String name, String icon){
		return new InvokerAction(name,icon,null,target,method);
	}

	public static Action create(Object target,String method,String name){
		return new InvokerAction(name,null,null,target,method);
	}
	
	public static Action create(Object target,String method,String name, String icon, String clickedIcon){
		return new InvokerAction(name,icon,clickedIcon,target,method);
	}
	
	private static class InvokerAction extends AbstractAction {

		private static final long serialVersionUID = -479979378726534518L;


		private Object target;
		private String method;
		
		public InvokerAction(String name,String icon,String clickedIcon, Object target, String method){
			putValue(Action.NAME, name);
			if (icon != null){
				putValue(Action.LARGE_ICON_KEY, new ImageIcon(getClass().getResource(icon)));
			}
			if (clickedIcon != null){
				putValue(CLICKED_ICON,new ImageIcon(getClass().getResource(clickedIcon)));
			}
			this.target = target;
			this.method = method;
		}

		@Override
		public void actionPerformed(ActionEvent event) {
			try {
				target.getClass().getMethod(method).invoke(target);
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
		
	}
}
