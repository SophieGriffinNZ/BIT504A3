import java.awt.Graphics;

public class Brick extends Sprite {
	
	private boolean broken = false;
	
	public Brick(int x, int y) {
		// TODO: Set x using the parameter
		// TODO: Set y using the parameter
		// TODO: Set the width and height of the brick using Settings.BRICK_WIDTH/HEIGHT
	}

	public boolean isBroken() {
		return false;	// TODO: Return the correct variable
	}
	public void setBroken(boolean b) {
		// TODO: Set the broken variable using the parameter given
	}
	
	public void paint(Graphics g) {
		if(!broken) {
			g.fillRect(x, y, Settings.BRICK_WIDTH, Settings.BRICK_HEIGHT);
		}
	}
}
