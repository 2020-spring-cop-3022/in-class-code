
public class Car
{
	private String color;
	private static int carCount = 0;
	
	public Car ()
	{
		this("grey");
	}
	public Car (String color)
	{
		this.color = color;
		++Car.carCount;
	}
	
	public String getColor ()
	{
		return this.color;
	}
	
	public static int getCarCount ()
	{
		return Car.carCount;
	}
}
