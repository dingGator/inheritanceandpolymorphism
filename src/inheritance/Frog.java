package inheritance;

public class Frog extends Critter {
	int wartCount = 0;
	Frog(String color) {
		super(color); // must be first
		this.wartCount = 5;
	}
	
	public boolean equals (Frog f) {
		return super.equals(f)
				 && f.wartCount == this.wartCount;
				
	}
}