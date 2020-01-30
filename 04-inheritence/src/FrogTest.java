import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FrogTest {

	@Test
	void test() {
		Frog k = new Frog();
		assertEquals("brown", k.getColor());
		assertEquals("", k.getName());
		
		Frog redFrog = new Frog("red");
		assertEquals("red", redFrog.getColor());
		
		Frog kermit = new Frog("green", "Kermit");
		assertEquals("green", kermit.getColor());
		assertEquals("Kermit", kermit.getName());
		
		assertEquals(0, kermit.getWartCount());
		assertEquals("go somewhere", kermit.getMoveStatement());
	}

}
