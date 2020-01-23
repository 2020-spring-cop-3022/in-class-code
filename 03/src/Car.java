
public class Car
{
	private String color;
	private int mph = 0;
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
	
	public int getMPH ()
	{
		return this.mph;
	}
	
	public void accelerate (int newSpeed)
	{
		this.mph = newSpeed;
	}
}
