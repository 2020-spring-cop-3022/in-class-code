
public class Frog extends Animal
{
	public Frog ()
	{
		this("brown");
	}

	public Frog (String color)
	{
		this(color, "");
	}
	
	public Frog (String color, String name)
	{
		super(color, name);
		// a bunch of other stuff that is common to all frogs
	}
}