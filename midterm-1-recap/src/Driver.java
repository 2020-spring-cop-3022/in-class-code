
public class Driver {
	public static void main (String[] args)
	{
		String[] foo = {"foo", "bar", "baz"};
		Driver d = new Driver(foo);
		
		foo[0] = "NOOOO";
		
		System.out.println(d.getFirst());
	}
	
	private String[] data;
	public Driver (String[] input)
	{
		// this.data = input; - Bad; shallow copy
		this.data = new String[input.length];
		for (int i = 0; i < input.length; ++i)
		{
			this.data[i] = input[i];
		}
	}
	
	public String getFirst ()
	{
		return this.data[0];
	}
 }
