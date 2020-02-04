import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnimalTest {

	@Test
	void test() {
		//Animal b = new Animal();
		Animal a = new Bird();
		assertEquals("I fly when I go somewhere", a.getMoveStatement());
		assertEquals("green", a.getColor());

		if (a instanceof Frog)
		{
			fail("Should not run");
			assertEquals(0, ((Frog)a).getWartCount());
		}
		
		a = new Frog();
		assertEquals("brown", a.getColor());
		
		//assertEquals(0, a.getWartCount()); not polymorphic
		assertEquals(0, ((Frog)a).getWartCount());
		
		// polymorphism
		
		assertEquals("go somewhere", a.getMoveStatement());

		Animal[] zoo = new Animal[10];
		//zoo[0] = new Animal();A // cannot initialize abstract
	}

}
