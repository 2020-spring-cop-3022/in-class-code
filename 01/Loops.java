import java.util.Scanner;

public class Loops {
	public static void main (String[] args)
	{
		assert (5 < 0);
		
		int foo = 12;
		System.out.println(""+foo+14);
		
		// looping
		for (int i = 0; i < 20; ++i)
		{
			// i = 21;
			System.out.println(i);
		}
		
		/*
		for ()
		{
			
		}
		*/
			
		while (true)
		{
			System.out.println("inside while loop");
			break;
		}
			
		int j = 0;
		do
		{
			System.out.println("inside do/while loop");
		} while (j < 0);
		
		String a = "foo";
		String b = "foo";
		
		if (a == b)
		{
			System.out.println("equal");
		}
		
//		String c;
//		Scanner keyboard = new Scanner(System.in);
//		c = keyboard.next();
//		
//		if (a == c)
//		{
//			System.out.println("equal");
//		}
//		else if (a.equals(c))
//		{
//			System.out.println("equal but not ==");
//		}
//		else
//		{
//			System.out.println("not equal");
//		}
//		
		double number =      1.00000001 - 1.0;
		double otherNumber = 0.00000001;
		double epsilon = 0.01;
		
		if (number == otherNumber)
		{
			System.out.println("two floats are the same");
		}
		else if (number - epsilon < otherNumber && number + epsilon > otherNumber)
		{
			System.out.println("Good enough for government work");
		}
	}
}
