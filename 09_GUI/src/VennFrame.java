import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class VennFrame extends JFrame
{
	public VennFrame ()
	{
		super("Venn diagram");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		VennDiagram v = new VennDiagram();
		this.add(v, BorderLayout.CENTER);
		// layout concerns??
		
		//SpinnerNumberModel wheel = new SpinnerNumberModel(50, 0, 300, 10);
		//JSpinner overlap = new JSpinner(wheel);
		
		JSlider overlap = new JSlider(0, 300, 50);
		overlap.addChangeListener(v);
		overlap.addChangeListener(new ResizeListener());
		
		JPanel controls = new JPanel();
		controls.add(new JLabel("A"));
		controls.add(overlap);
		controls.add(new JLabel("Z"));
		this.add(controls, BorderLayout.SOUTH);
		
		this.setLocation(1800,0); // display on second monitor - Dr. Bitner's setup
		this.pack();
	}
	public static void main (String[] args)
	{
		VennFrame frame = new VennFrame();

		// do some other stuff
		
		frame.setVisible(true);
	}
	
	private class ResizeListener implements ChangeListener
	{
		@Override
		public void stateChanged (ChangeEvent e)
		{
			// JOptionPane.showMessageDialog(null, "changed");
			VennFrame.this.pack();
		}
	}
}