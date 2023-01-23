import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Breakout extends JFrame{
	
	static final long serialVersionUID = 1L;
	
	private BreakoutPanel panel;
	
	private final static Color BACKGROUND_COLOUR = Color.WHITE;
	
	public Breakout() {
		// TODO: Set the size of the screen (use Settings.WINDOW_WIDTH/HEIGHT)
		// TODO: Set the title
		// TODO: Set the background colour to white
		setBackground(BACKGROUND_COLOUR);
		// TODO: Set resizable to false
		panel = new BreakoutPanel(this);
		panel.setSize(Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);
		Border border = BorderFactory.createTitledBorder(Settings.WINDOW_NAME);
		panel.setBorder(border);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new BreakoutPanel(this);
        add(panel);
		// TODO: Set visible to true
		setVisible(true);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
	         public void run() {
	        	 new Breakout();	
	         }
		});

	}
}
