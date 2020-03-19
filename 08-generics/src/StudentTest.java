import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {

	@Test
	void test() {
		Student<Double, Integer> s1 = new Student<Double, Integer>("Alan Turing", 99.8, 1);
		
		assertEquals("Alan Turing has a 99.8", s1.toString());
		
		Student<Character, Integer> s2 = new Student<>("Joe Dirt", 'C', 999);
		assertEquals("Joe Dirt has a C", s2.toString());
	}

}
