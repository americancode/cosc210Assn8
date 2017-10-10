import javax.swing.JFrame;

/**
 * COSC 210-001 Prog8.java
 * 
 * This program converts centimeters to inches or inches to centimeters in a GUI
 * 
 * @author Nathaniel Churchill
 *
 */
public class Prog8 {

	public static void main(String[] args) {
		// creating the window
		Prog8Frame window = new Prog8Frame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(250, 180);
		window.setVisible(true);
	}

}
