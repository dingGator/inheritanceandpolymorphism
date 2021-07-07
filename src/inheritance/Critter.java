package inheritance;

public class Critter {
	private String color;
	
	Critter() {
		this("white");
	}
	Critter(String color) {
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}
	
	public boolean equals (Critter c) {
		return c != null
				&& c.getClass() == this.getClass()
				&& c.getColor() == this.getColor();
		
	}
}
