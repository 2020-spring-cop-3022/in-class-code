import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {

	@Test
	void test() {
		Student<Double> s1 = new Student<Double>("Alan Turing", 99.8);
		
		assertEquals("Alan Turing has a 99.8", s1.toString());
		
		Student<Character> s2 = new Student<>("Joe Dirt", 'C');
		assertEquals("Joe Dirt has a C", s2.toString());
	}

}
