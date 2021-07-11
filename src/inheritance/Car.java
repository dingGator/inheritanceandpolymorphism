package inheritance;

public class Car {
	private String color;
	private String make;
	private int mpg;
	
	Car() {
		this("grey", "jalopy", -1);
	}
	Car(String color, String make, int mpg) {
		this.color = color;
		this.make = make;
		this.mpg = mpg;
	}
	public String toString() {
		return "[color=" + this.color + ", make=" + this.make 
				+ ", mph=" + this.getMpg() + "]";
	}
	private String getMpg() {
		if(this.mpg == -1) {
			return "unknown";
		} else {
			return "" + this.mpg;
		}
	}
	public void setMpg(int newMpg) {
		this.mpg = newMpg;
	}
	public void paint(String newColor) {
		this.color = newColor;
	}
	

}
