package inheritance;

public class Animals {
	protected String name;
	protected int weigh;
	protected String food;
	protected String outPut;
	
	
	Animals(){
		this("name",0,"food");
		
	}
	Animals(String inName,int inWeigh, String inFood) {
		this.name = inName;
		this.weigh = inWeigh;
		this.food = inFood;
	}
	
	public String toString() {
		this.outPut = this.name + " the animal weighs " 
				+ this.weigh + "kg and loves to eat " + this.food;
		return this.outPut;
	}
}
