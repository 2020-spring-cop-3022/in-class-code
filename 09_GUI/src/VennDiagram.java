import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;

public class VennDiagram extends JComponent
{
	public VennDiagram ()
	{
		super();
	}

	@Override
	public void paint (Graphics g)
	{
		g.fillOval(25, 25, 100, 100);
	}
	
	@Override
	public Dimension getPreferredSize ()
	{
		return new Dimension(150, 150);
	}
}