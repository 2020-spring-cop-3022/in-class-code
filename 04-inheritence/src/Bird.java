
public class Bird
{
	private String color;
	private String name;
	
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
		this.color = color;
		this.name = name;
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
