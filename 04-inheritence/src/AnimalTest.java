import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnimalTest {

	@Test
	void test() {
		Animal a = new Bird();
		assertEquals("green", a.getColor());
		if (a instanceof Frog)
		{
			fail("Should not run");
			assertEquals(0, ((Frog)a).getWartCount());
		}
		
		a = new Frog();
		assertEquals("brown", a.getColor());
		
		assertEquals(0, ((Frog)a).getWartCount());
	}

}
