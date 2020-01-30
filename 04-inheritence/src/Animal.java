public class Animal {

	private String color;
	private String name;
	
	public Animal (String color, String name)
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
	
	public String getMoveStatement ()
	{
		return "go somewhere";
	}
}
