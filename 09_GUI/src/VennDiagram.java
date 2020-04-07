import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class VennDiagram extends JComponent implements ChangeListener
{
	public static final int X_OFFSET = 50;
	public static final int Y_OFFSET = 50;
	public static final int DIAMETER = 300;

	public VennDiagram ()
	{
		super();
	}

	@Override
	public void paint (Graphics g)
	{
		g.setColor(new Color(0, 155, 0, 100));
		g.fillOval(X_OFFSET, Y_OFFSET, DIAMETER, DIAMETER);
		g.setColor(new Color(0, 0, 255, 100));
		g.fillOval(DIAMETER, Y_OFFSET, DIAMETER, DIAMETER);
	}
	
	@Override
	public Dimension getPreferredSize ()
	{
		return new Dimension(2*DIAMETER + X_OFFSET, DIAMETER + 2*Y_OFFSET);
	}
	
	@Override
	public void stateChanged (ChangeEvent e)
	{
		System.out.println("foo");
	}
}