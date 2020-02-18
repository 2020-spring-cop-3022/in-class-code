import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExceptionTester {

	@Test
	void test() {
		String[] names = new String[10];
		
		try
		{
			int nameLength = names[0].length();
			fail("exception not throw");
		}
		catch (Exception e)
		{
			assertEquals(1, 1);
			System.out.println("Exception caught: "+e.getMessage());
		}

		System.out.println("We made it");
	}

}
