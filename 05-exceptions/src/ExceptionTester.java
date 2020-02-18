import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExceptionTester {

	@Test
	void test() {
		String[] names = new String[10];
		// using lambda
		assertThrows(NullPointerException.class,
				() -> { int nameLength = names[0].length(); });
		
		while (true)
		{
			// using common syntax
			try
			{
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

}
