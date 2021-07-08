package inheritance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BuidMe {

	@Test
	void foo() {
		Point p = new Point(3, 4);

		int hypotenuse = p.distanceFromOrigin();
		assertEquals(5, hypotenuse);
	}

}
