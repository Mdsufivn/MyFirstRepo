package FirstJava;

public class ArrayDemo {

	public static void main(String[] args) {
		
		//Declaring Array
		String[] myArray = new String[3];
		
		myArray[0] = "Seleneiium";
		myArray[1] = "Eclipse";
		myArray[2] = "Java";
		
		System.out.println(myArray[1]);
		
		for (int i=0; i<myArray.length; i++) {
			System.out.println(myArray[1]);
			
		//Another way of declaring Array
		int [] number = {4,2,7};
		for (int i=0; i<number.length; i++) {
			System.out.println(number[i]);
			
		//Example of enhanced for loop
			for (int val: number) {
				System.out.println(val);
			}
		}
		}
	}

}
