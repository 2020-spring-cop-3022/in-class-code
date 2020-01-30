import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BirdTest {

	@Test
	void test() {
		Bird b = new Bird();
		assertEquals("green", b.getColor());
		
		Bird cardinal = new Bird("red");
		assertEquals("red", cardinal.getColor());
		
		Bird bigBird = new Bird("yellow", "Big Bird");
		assertEquals("yellow", bigBird.getColor());
		assertEquals("Big Bird", bigBird.getName());
	}
}