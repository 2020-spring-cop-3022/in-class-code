
public class Car
{
	private String color;
	private int mph = 0;
	private static int carCount = 0;
	private Transmission transmissionType;
	
	public Car ()
	{
		this("grey", Transmission.AUTOMATIC);
	}
	public Car (String color, Transmission t)
	{
		this.color = color;
		this.transmissionType = t;
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
	
	public Transmission getTransmissionType ()
	{
		return this.transmissionType;
	}
}
