import java.awt.BorderLayout;

import javax.swing.JFrame;

public class VennFrame extends JFrame
{
	public VennFrame ()
	{
		super("Venn diagram");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main (String[] args)
	{
		VennFrame frame = new VennFrame();
		
		VennDiagram v = new VennDiagram();
		frame.add(v, BorderLayout.CENTER);
		// layout concerns??
		
		frame.setLocation(1800,0); // display on second monitor - Dr. Bitner's setup
		frame.pack();
		frame.setVisible(true);
	}
}