
public class Difference {
	
	public static void main (String[] args)
	{
		foo(10);
		
		int i = 10;
		while (i > 0)
		{
			System.out.println("Foo");
			--i;
		}
	}

	public static void foo (int i)
	{
		System.out.println(i);
		if (i < 0) // base case
		{
			return;
		}
		foo(i-1);
	}
}
