import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Type_C_GameObject extends GameObject implements KeyListener{

	public Type_C_GameObject(int x, int y) {
		super(x, y);
		setDirection(Direction.NONE);
	    
	    imageList = new LinkedList<Icon>();
	    imageList.add(new ImageIcon("images/Type_C_Right.png"));
	    imageList.add(new ImageIcon("images/Type_C_Left.png"));
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
		      setDirection(Direction.RIGHT);
		    }
		    if (e.getKeyCode() == KeyEvent.VK_LEFT) {
		      setDirection(Direction.LEFT);
		    }
	}

	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() != KeyEvent.VK_TAB) {
		      setDirection(Direction.NONE);
		    }
	}

	public void move(Canvas c) {
		Icon icon = getCurrentImage();

	    //int  iconHeight   = icon.getIconHeight();
	    int  iconWidth    = icon.getIconWidth();
	    //int  canvasHeight = (int)c.getSize().getHeight();
	    int  canvasWidth  = (int)c.getSize().getWidth();
	    
	    //MOVE BLUE GAME OBJECT
	    switch (getDirection()) {
	      case Direction.RIGHT:
	        setX(getX() + getVelocity());
	        if (getX() + iconWidth > canvasWidth) {
	          setX((int)(canvasWidth - iconWidth));
	        }
	        break;
	      case Direction.LEFT:
	        setX(getX() - getVelocity());
	        if (getX() < 0) {
	          setX(0);
	        }
	        break;
		default:
			break;
	    }
	}

	public void setImage() {
		
		switch (getDirection()) {
	      case Direction.NONE:
	        break;
	      case Direction.RIGHT:
	        currentImage = 1;
	        break;
	      case Direction.LEFT:
	        currentImage = 0;
	        break;
	    }
		
	}

}
