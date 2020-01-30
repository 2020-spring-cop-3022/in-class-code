
public class Bird extends Animal
{
	public Bird ()
	{
		this("green");
	}

	public Bird (String color)
	{
		this(color, "");
	}
	
	public Bird (String color, String name)
	{
		super(color, name);
	}
}