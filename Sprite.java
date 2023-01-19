import java.awt.Rectangle;

public class Sprite {
	
	protected int x,y,width,height;
	
	// Note: This should only set a single value, they can be done in a single statement
	public void setX(int x) {
		// TODO
	}
	public void setY(int y) { 
		// TODO
	}
	public void setWidth(int width) { 
		// TODO
	}
	public void setHeight(int height) { 
		// TODO
	}
	
	// Note: Change the "0" to the correct variable
	public int getX() { 
		return 0;	// TODO: Return correct value
	}
	public int getY() { 
		return 0;	// TODO: Return correct value
	}
	public int getWidth() { 
		return 0;	// TODO: Return correct value
	}
	public int getHeight() { 
		return 0;	// TODO: Return correct value
	}
	
	Rectangle getRectangle() {
		return new Rectangle(x, y, width, height);
	}
}
