public class Main
{
	public static void main (String[] args)
	{
		int foo = 12;

		if (foo > 7)
		{
		}
		// many
		else if (false)
		{
		}
		else // < 7 || == 7
		{
		}

		// BAD EXAMPLES
		if (false)
			System.out.println("Nooooo");
		int bar = (foo == 12) ? 12 : (baz > 5) ? 13: 7;
		// END BAD EXAMPLES

		//if ()
		//{
		//}

		switch (foo)
		{
			case 1:
				// shouldn't happen foo ==7
			case 12:
				// do whatever we do
				System.out.println("12");
				break;
			default:
				System.out.println("Nooooo");
		}
	}
}
