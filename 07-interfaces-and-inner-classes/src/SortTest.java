import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortTest {

	@Test
	void test() {
		int[] unsortedList = {4, -6, 0, 10, 3, 27};
		int[] sortedList = {-6, 0, 3, 4, 10, 27};
		
		// do the magic
		Sort.sortMe(unsortedList);
		
		assertArrayEquals(sortedList, unsortedList);
	}

}
