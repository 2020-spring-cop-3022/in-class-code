
public class Frog
{
	private String color;
	private String name;
	
	public Frog ()
	{
		this("brown");
	}

	public Frog (String color)
	{
		this(color, "");
	}
	
	public Frog (String color, String n)
	{
		this.color = color;
		this.name = n;
		// a bunch of other stuff that is common to all frogs
	}
	
	public String getColor ()
	{
		return this.color;
	}
	
	public String getName ()
	{
		return this.name;
	}
}
