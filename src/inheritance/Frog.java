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
	
	/*@Override
	* can override if the super function is NOT final
	
	*public String getColor() {
	*	return super.getColor() + " frog";
		
	}
	*/
	
	public String myTitle() {
		return "Hoppy Frog";
	}
	
	//must have a move class because abstract in super class
	@Override
	public String move () {
		return "hop hop hop";
	}
	
}