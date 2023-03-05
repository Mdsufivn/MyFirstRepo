package Method_Demo;

public class Test_Calculater {

	public static void main(String[] args) {
		// Created an object of Calculator class

		Calculater calc = new Calculater();
		
		System.out.println("Addition of A and B is: " + calc.doAdd(25, 12));
		System.out.println("Subtraction of B and A is: " + calc.doSub(40, 4));
		System.out.println(calc.concatStr("Hello", "Everyone"));
		
		Test_Calculater obj = new Test_Calculater();
		System.out.println(obj.doMul(54, 95));
		System.out.println(doDiv(30, 7));
		obj.sound();
		obj.noise(); // for non static, you need to create an obj in Static method
		System.out.println(Calculater.do3Mul(1, 2, 3) );;
	}
	
	public int doMul(int a, int b) {
		
		int c = a * b;
		return c;
	}
	
	public static double doDiv(int a, int b) {
		
		double c = a/b;
		return c;
	}
	public void sound() {
		System.out.println("This is a generic sound");
	}
	public void noise() {
		System.out.println("I can also make sounds");
	}
}

		// Static: a Method created
		// Nonstatic: Refer to a static method that was created

