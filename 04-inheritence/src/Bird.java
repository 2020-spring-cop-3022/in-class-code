
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

	@Override
	public String getMoveStatement ()
	{
		return "I fly when I "+super.getMoveStatement();
	}
}