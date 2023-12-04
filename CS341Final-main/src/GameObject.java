import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;


//GENERAL GAME OBJECT
public abstract class GameObject {
	//EACH GAME OBJECT HAS AN X,Y LOCATION, VELOCITY, AND A DIRECTION

	private int x;
	private int y;
	private int velocity;
	private int direction;

	//EACH GAME OBJECT CAN HAVE A COLLECTION OF IMAGES
	protected List<Icon> imageList;
	protected int currentImage; 

	public GameObject(int x, int y) {
		this.x = x;
		this.y = y;
		velocity = 0;
		currentImage = 0;
	}

	public void draw(Component c, Graphics g) {
		imageList.get(currentImage).paintIcon(c, g, x, y);
	}
	
	public void drawSquare(Icon redSquare, Component c, Graphics g) {
		
		int newWidth = 150; // Set the new width
		int newHeight = 150; // Set the new height
		
		// Scale the red square icon to the desired dimensions
	    Image scaledImage = ((ImageIcon) redSquare).getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

	    // Create a new ImageIcon with the scaled image
	    ImageIcon scaledIcon = new ImageIcon(scaledImage);

	    // Draw the scaled red square
	    scaledIcon.paintIcon(c, g, x, y);
	}

	// SETTERS AND GETTERS

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	public int getVelocity() {
		return velocity;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public Icon getCurrentImage() {
		return imageList.get(currentImage);
	}
	
	//ABSTRACT METHODS
	public abstract void move(Canvas c);
	public abstract void setImage();

}
