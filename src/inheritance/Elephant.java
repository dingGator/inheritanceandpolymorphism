package inheritance;

public class Elephant extends Animals {
	// private String animal;
	
	Elephant(String inName,int inWeigh, String inFood) {
		super(inName, inWeigh, inFood);
	}

	
	/*
	 * Elephant(String inName, int inWeigh,String inFood) { this.animal =
	 * "elephant"; }
	 */
	
	@Override
	public String toString() {
			super.outPut = super.name + " the elephant weighs " 
					+ super.weigh + "kg and loves to eat "
					+ super.food;
			return outPut;
		
	}
}
