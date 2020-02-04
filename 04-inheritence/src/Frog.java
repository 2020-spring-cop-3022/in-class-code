
public class Frog extends Animal
{
	private int wartCount;
	
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
		this.wartCount = 0;
	}
	
	public int getWartCount ()
	{
		return this.wartCount;
	}

	public String getMoveStatement ()
	{
		return "go somewhere";
	}
}