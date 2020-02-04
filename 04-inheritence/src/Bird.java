
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
		// no longer works since method is now abstract
		// return "I fly when I "+super.getMoveStatement();
		return "I fly when I go somewhere";
	}
}