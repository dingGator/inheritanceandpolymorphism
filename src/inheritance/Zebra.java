package inheritance;

public class Zebra extends Animals{
	// private String animal;
	
	Zebra(String inName,int inWeigh, String inFood) {
		super(inName, inWeigh, inFood);
	}

	/*
	 * Zebra(String inName,int inWeigh, String inFood) { this.animal = "zebra";
	 * this.name = inName; super.weigh = inWeigh; super.food = inFood; }
	 */
	
	
	@Override
	public String toString() {
		super.outPut = super.name + " the zebra weighs " 
				+ super.weigh + "kg and loves to eat " + super.food;
		return super.outPut;
	}
}
