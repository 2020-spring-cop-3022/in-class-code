import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

	@Test
	void test() {
		Integer[] list = {12, 13, 19, 23, 39, 498, 583, 679, 1001, 1003};
		int index = BinarySearch.search(list, 0, list.length -1, 10);
		assertEquals(-1, index);
		
		index = BinarySearch.search(list, 0, list.length -1, 23);
		assertEquals(3, index);

		index = BinarySearch.search(list, 0, list.length -1, 12);
		assertEquals(0, index);
	}

}
