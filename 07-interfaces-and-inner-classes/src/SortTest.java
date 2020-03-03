import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortTest {

	@Test
	void test() {
		Integer[] unsortedList = {4, -6, 0, 10, 3, 27};
		Integer[] sortedList = {-6, 0, 3, 4, 10, 27};
		
		Sort.sortMe(unsortedList);
		
		assertArrayEquals(sortedList, unsortedList);
		
		Double[] unsortedDoubles = {4.0, -6.0, 0.0, 10.0, 3.0, 27.0};
		Double[] sortedDoubles = {-6.0, 0.0, 3.0, 4.0, 10.0, 27.0};

		Sort.sortMe(unsortedDoubles);
		
		assertArrayEquals(sortedDoubles, unsortedDoubles);
		
		//Student[] roster = new Student[10];
		//Sort.sortMe(roster);
	}

}
