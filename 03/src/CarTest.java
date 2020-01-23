import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void test() {
		//String foo = new String("bar");
		Car jalopy = new Car();
		assertEquals("grey", jalopy.getColor());
		assertEquals(Transmission.AUTOMATIC, jalopy.getTransmissionType());

		Car corvette = new Car("red", Transmission.MANUAL);
		
		assertEquals("red", corvette.getColor());
		
		assertEquals(2, Car.getCarCount());
		
		assertEquals(0 , corvette.getMPH());
		corvette.accelerate(50);
		assertEquals(50 , corvette.getMPH());
		
		assertEquals(Transmission.MANUAL, corvette.getTransmissionType());
	}

}
