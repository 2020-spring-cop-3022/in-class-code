import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExceptionTester {

	@Test
	void test()
	{
		String[] names = new String[10];
		// using lambda
		assertThrows(NullPointerException.class,
				() -> { int nameLength = names[0].length(); });
		
		while (true)
		{
			// using common syntax
			try
			{
				ExceptionTester.static1();
				int nameLength = names[0].length();
				fail("exception not throw");
				throw new UnauthorizedUserException("foo");
			}
			catch (NullPointerException e)
			{
				assertEquals(1, 1);
				System.out.println("Exception caught: "+e.getMessage());
				break;
			}
			catch (UnauthorizedUserException e)
			{
				// do something
				System.out.println("UnauthorizedUserException caught");
				break;
			}
			catch (Exception e)
			{
				fail("base exception thrown");
			}
			finally
			{
				System.out.println("We made it");
			}
		}
	}

	public static void static1 () throws UnauthorizedUserException
	{
		ExceptionTester.static2();
	}

	public static void static2 () throws UnauthorizedUserException
	{
		// encountered something bad
		// but it doesn't know what to do
		throw new UnauthorizedUserException("foo");
	}
}
