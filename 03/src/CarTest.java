import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void test() {
		//String foo = new String("bar");
		Car jalopy = new Car();
		assertEquals("grey", jalopy.getColor());

		Car corvette = new Car("red");
		
		assertEquals("red", corvette.getColor());
		
		assertEquals(2, Car.getCarCount());
	}

}
