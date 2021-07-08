package inheritance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ZooTester {

	@Test
	void classTester() {
		Animals a[] = new Animals[3];
		a[0] = new Zebra("Jason", 250, "Lettuce");
		a[1] = new Elephant("Jasmine", 4000, "Bananas");
		a[2] = new Elephant("Big Lou", 6200, "EVERYTHING");
		String[] expectedOutput = {
				"Jason the zebra weighs 250kg and loves to eat Lettuce",
				"Jasmine the elephant weighs 4000kg and loves to eat Bananas",
				"Big Lou the elephant weighs 6200kg and loves to eat EVERYTHING"};
		
		for(int i = 0; i <a.length; ++i) {
			assertEquals(expectedOutput[i], a[i].toString());
		}
	}
	

}
