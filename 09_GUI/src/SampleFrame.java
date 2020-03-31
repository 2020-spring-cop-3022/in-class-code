import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SampleFrame extends JFrame
{
	public SampleFrame ()
	{
		super();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(100, 100);
	}
	
	public static void main (String[] args)
	{
		SampleFrame frame = new SampleFrame();

		// components
		JButton button = new JButton("Go Argos!!");
		frame.add(button);
		
		JLabel someText = new JLabel("UWF");
		frame.add(someText, BorderLayout.SOUTH);

		// layout
		
		// show me
		frame.setVisible(true);
	}
}
