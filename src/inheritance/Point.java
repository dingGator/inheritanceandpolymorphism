package inheritance;

public class Point {
	private int num1x;
	private int num2y;
	private int hypothenuse;
	Point() {
		this(0,0);
	}
	Point(int inputNum1, int inputNum2) {
		num1x = inputNum1;
		num2y = inputNum2;
	}
	
	public int distanceFromOrigin() {
		hypothenuse = (int)Math.sqrt(num1x * num1x + num2y * num2y);
		return hypothenuse;
	}

}
