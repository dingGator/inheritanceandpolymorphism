package inheritance;

abstract public class Critter {
	private String color;
	
	Critter() {
		this("white");
	}
	Critter(String color) {
		this.color = color;
	}
	final public String getColor() {
		return this.color;
	}
	
	public boolean equals (Critter c) {
		return c != null
				&& c.getClass() == this.getClass()
				&& c.getColor() == this.getColor();
		
	}
	
	// abstract methods must be in abstract class
	
	abstract public String myTitle();
	abstract public String move();
	
	
}
