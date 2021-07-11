package inheritance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void test() {
		Car a = new Car();
		assertEquals("[color=grey, make=jalopy, mph=unknown]",a.toString());
		Car c = new Car("blue", "honda", 23);
		assertEquals("[color=blue, make=honda, mph=23]",c.toString());
		c.setMpg(27);
		assertEquals("[color=blue, make=honda, mph=27]",c.toString());
		c.paint("red");
		assertEquals("[color=red, make=honda, mph=27]",c.toString());
	}

}
