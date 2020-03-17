import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwapperTest {

	@Test
	void test() {
		Integer[] foo = {12, 3, -4, 0, 721};
		Swapper.swap(foo, 0, 2);
		
		assertEquals(new Integer(-4), foo[0]);
		assertEquals(new Integer(12), foo[2]);
	}
}