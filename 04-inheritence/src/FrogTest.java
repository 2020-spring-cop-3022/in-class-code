import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FrogTest {

	@Test
	void test() {
		Frog k = new Frog();
		
		Frog redFrog = new Frog("red");
		assertEquals("red", redFrog.getColor());
	}

}