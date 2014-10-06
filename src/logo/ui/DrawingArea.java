package logo.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

public class DrawingArea extends JComponent {

	private static final long serialVersionUID = 4220192888449930731L;

	private BufferedImage image;
	
	private double x = 0;
	private double y = 0;
	private int centerX = 400;
	private int centerY = 300;
	private double angle = 270;
	private boolean draw = true;
	private Color color = Color.BLACK;
	private BufferedImage turtle;
	private boolean show = true;
	private Path2D currentPath = null;
	
	public DrawingArea() {
		image = new BufferedImage(800,600,BufferedImage.TYPE_INT_RGB);
		try {
			turtle = ImageIO.read(getClass().getResource("/turtle.png"));
		} catch (IOException e) {}
		noDraw();
		goHome();
		draw();
		clear();
	}
	
	public void clear(){
		Graphics g = image.getGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 800, 600);
		currentPath = null;
		queueRepaint();
	}
	
	public void goHome() {
		
		if (draw){
			Graphics2D g = (Graphics2D)image.getGraphics();
			g.setColor(color);
			g.draw(new Line2D.Double(x, y, centerX, centerY));
		}
		
		x = centerX;
		y = centerY;
		angle = 270;
		queueRepaint();
	}
	
	private void queueRepaint(){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				repaint();
			}
		});
	}

	protected void paintComponent(Graphics g){
		
		int deltaX = (getWidth() - image.getWidth())/2;
		int deltaY = (getHeight() - image.getHeight())/2;
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(getBackground());
		g2d.fillRect(0,0,getWidth(),getHeight());
		g2d.drawImage(image,deltaX,deltaY,this);
		
		if (show){
			AffineTransform tx = new AffineTransform();
			tx.rotate(angle * Math.PI / 180.0,12,12);
			
			AffineTransform locate = new AffineTransform();
			locate.translate(deltaX+x-12, deltaY+y-12);
			
			locate.concatenate(tx);
			
			g2d.drawImage(turtle, locate, this);
		}
	}
	
	public void forward(double steps){
		double angle = this.angle * Math.PI / 180.0;
		
		double dx = x + steps * Math.cos(angle);
		double dy = y + steps * Math.sin(angle);

		if (draw){
			Graphics2D g = (Graphics2D)image.getGraphics();
			g.setColor(color);
			g.draw(new Line2D.Double(x, y, dx, dy));
		}
		
		if (currentPath != null){
			if (draw){
				currentPath.lineTo(dx, dy);
			} else {
				currentPath.moveTo(dx, dy);
			}
		}
		
		x = dx;
		y = dy;
		
		queueRepaint();
	}

	public void goTo(int x2, int y2) {
		if (draw){
			Graphics2D g = (Graphics2D)image.getGraphics();
			g.setColor(color);
			g.draw(new Line2D.Double(x, y, x2, y2));
		}
		
		if (currentPath != null){
			if (draw){
				currentPath.lineTo(x2, y2);
			} else {
				currentPath.moveTo(x2, y2);
			}
		}
		
		x = x2;
		y = y2;
		
		queueRepaint();
	}
	
	public void backward(double steps){
		forward(-steps);
	}
	
	public void right(double steps){
		angle += steps;
		queueRepaint();
	}
	
	public void left(double steps){
		right(-steps);
	}
	
	public void draw(){
		draw = true;
	}
	
	public void noDraw(){
		draw = false;
	}

	public void color(int r, int g, int b) {
		this.color = new Color(r,g,b);
	}
	
	public Color getColor(){
		return this.color;
	}

	public void write(Object something) {
		String text = String.valueOf(something);
		
		Graphics2D g = (Graphics2D)image.getGraphics();
		g.setColor(color);
		FontMetrics fm = g.getFontMetrics();
		
		int distance = fm.stringWidth(text);
		
		AffineTransform tx = g.getTransform();
		double angle = this.angle * Math.PI / 180.0;
		AffineTransform rotation = new AffineTransform();
		rotation.rotate(angle);
		
		AffineTransform locate = new AffineTransform();
		locate.translate(x, y);
		
		locate.concatenate(rotation);
		
		g.setTransform(locate);
		
		g.drawString(text,0,0);
		
		g.setTransform(tx);
		
		x += distance * Math.cos(angle);
		y += distance * Math.sin(angle);
		
		queueRepaint();
	}
	
	public void show(){
		show = true;
		queueRepaint();
	}
	
	public void noShow(){
		show = false;
		queueRepaint();
	}
	
	public void beginFill(){
		currentPath = new Path2D.Double();
		currentPath.moveTo(x, y);
	}
	
	public void endFill(){
		if (currentPath != null){
			
			Graphics2D g = (Graphics2D)image.getGraphics();
			g.setColor(color);
			g.fill(currentPath);
			
			queueRepaint();
			
			currentPath = null;
		}
	}
	
	public void exportImage(OutputStream output) throws IOException{
		ImageIO.write(image, "png", output);
	}
	
	public Dimension getImageSize(){
		return new Dimension(image.getWidth(),image.getHeight());
	}
	
	public void drawImageOn(Graphics g){
		g.drawImage(image, 0, 0, this);
	}

	public BufferedImage getImage() {
		return image;
	}
}
