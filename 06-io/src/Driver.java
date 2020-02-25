
public class Driver {
	public static void main (String[] args)
	{
		String name = "world";
		System.out.println("hello "+name);
		System.out.printf("hello %s\n", name);
		System.out.printf("hello %12s\n", name);
		System.out.printf("hello %-12s\n", name);

		System.out.printf("hello %.3s\n", name);
		
		int foo = 12;
		System.out.printf("hello %012d\n", foo);
		System.out.printf("hello %12d\n", foo);
		
		double bar = 12.123456789;
		System.out.printf("%.4f\n", bar);
		System.out.printf("%4f\n", bar);
	}

}
