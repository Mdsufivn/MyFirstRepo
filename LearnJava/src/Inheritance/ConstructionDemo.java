package Inheritance;

public class ConstructionDemo {

	
	String name;
	int rollNo;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	//example of a constructor
	public ConstructionDemo(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
		System.out.println("Called");
	}
}


