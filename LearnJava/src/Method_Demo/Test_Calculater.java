package Method_Demo;

public class Test_Calculater {

	public static void main(String[] args) {
		// Created an object of Calculator class

		Calculater calc = new Calculater();
		
		System.out.println("Addition of A and B is: " + calc.doAdd(25, 12));
		System.out.println("Subtraction of B and A is: " + calc.doSub(40, 4));
		
	}

}

