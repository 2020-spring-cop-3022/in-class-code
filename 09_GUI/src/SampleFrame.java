import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SpinnerNumberModel;

public class SampleFrame extends JFrame
{
	public SampleFrame ()
	{
		super();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setSize(100, 100);
	}
	
	public static void main (String[] args)
	{
		SampleFrame frame = new SampleFrame();

		// components
		JButton button = new JButton("Go Argos!!");
		frame.add(button);
		
		JLabel someText = new JLabel("UWF");
		someText.setHorizontalAlignment(JLabel.CENTER);
		frame.add(someText, BorderLayout.SOUTH);
		
		// anonymous
		frame.add(new JButton("Foo"), BorderLayout.NORTH);

		JTextArea myTextArea = new JTextArea("Nothing yet", 3, 80);
		myTextArea.setText("foo");
		frame.add(myTextArea, BorderLayout.NORTH);
		
		SpinnerNumberModel nums = new SpinnerNumberModel(150, 0, 200, 1);
		JSpinner wheel = new JSpinner(nums);
		frame.add(wheel, BorderLayout.EAST);

		frame.add(new JButton(new ImageIcon("icon.jpg")), BorderLayout.WEST);
		// show me
		frame.setLocation(1800,0); // display on second monitor - Dr. Bitner's setup
		frame.pack();
		frame.setVisible(true);
	}
}
