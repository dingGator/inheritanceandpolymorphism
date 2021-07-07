package inheritance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CritterTest {

	@Test
	void test() {
		Critter critter = new Critter();
		String defaultColor = critter.getColor();
		assertEquals("white",defaultColor);
		Frog kermit = new Frog("green");
		String color = kermit.getColor();
		assertEquals("green",color);
		
		// object compares with == pointing to same place in memory
		Frog newKermit = new Frog("green");
		
		Frog[] frogs = new Frog[10];
		frogs[0] = new Frog("green");
		assertTrue(kermit.equals(frogs[0]));
		assertTrue(kermit.equals(newKermit));
		
		
	}

}
