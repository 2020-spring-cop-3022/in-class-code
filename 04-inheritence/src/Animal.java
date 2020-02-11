public abstract class Animal {

	private String color;
	private String name;
	public static final int NUMBER_OF_WORKDAYS = 5;
	
	public Animal (String color, String name)
	{
		this.color = color;
		this.name = name;
		int[] foo = new int[NUMBER_OF_WORKDAYS];
	}
	
	final public String getColor ()
	{
		return this.color;
	}
	
	public String getName ()
	{
		return this.name;
	}
	
	abstract public String getMoveStatement ();
}
