
public class Loops {
	public static void main (String[] args)
	{
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
	}
}
