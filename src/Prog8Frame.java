import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * COSC 210-001 Prog8Frame.java
 * 
 * This class is the GUI for my application
 * 
 * @author Nathaniel Churchill
 *
 */
public class Prog8Frame extends JFrame {
	// attributes
	private JLabel labelOne;
	private JLabel inLabel;
	private JLabel cmLabel;
	private JTextField inText;
	private JTextField cmText;
	private JButton cmToIn;
	private JButton inToCm;

	public Prog8Frame() {
		super("Prog 8");
		setLayout(new FlowLayout());

		// Label one
		Icon ruler = new ImageIcon(getClass().getResource("ruler.png"));
		labelOne = new JLabel("Metric Converter", ruler, SwingConstants.LEFT);
		add(labelOne);

		// inch label
		inLabel = new JLabel("Inches");
		add(inLabel);

		// inch text field
		inText = new JTextField(10);
		add(inText);

		// centimeter label
		cmLabel = new JLabel("Centimeters");
		add(cmLabel);

		// centimeter text field
		cmText = new JTextField(10);
		add(cmText);

		// inches to centimeters button
		inToCm = new JButton("IN to CM");
		add(inToCm);
		inToCm.addActionListener(new ButtonHandler());

		// centimeters to inches button
		cmToIn = new JButton("CM to IN");
		add(cmToIn);
		cmToIn.addActionListener(new ButtonHandler());
	}

	// button handling class for both buttons
	private class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			if (event.getSource().equals(cmToIn)) {
				try {
					double cm = Double.parseDouble(cmText.getText());
					double in = cm * (1 / 2.54);
					inText.setText(String.format("%.1f", in));
				} catch (Exception e) {
					cmText.setText("No CM Input");
				}

			} else {
				try {
					double in = Double.parseDouble(inText.getText());
					double cm = in * 2.54;
					cmText.setText(String.format("%.1f", cm));
				} catch (Exception e) {
					inText.setText("No IN Input");
				}
			}

		}

	}

}
