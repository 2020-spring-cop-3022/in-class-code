import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MaxTest {

	@Test
	void test() {
		ArrayList<Integer> myInts = new ArrayList<Integer>();
		myInts.add(12);
		myInts.add(8);
		myInts.add(17);
		myInts.add(0);
		myInts.add(-12);
		myInts.add(15);
		
		Integer max = Max.getMax(myInts);
		assertEquals(new Integer(17), max);
	}

}
