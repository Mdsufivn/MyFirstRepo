package Data_Types;

public class Else_Demo {

	public static void main(String[] args) {
		
		/* Else if Syntax:
		 * 
		 * if (condition)
		 * { code to be executed
		 * )else if (condition)
		 * {
		 * code to be executed
		 * }else
		 * {
		 * code to be executed
		 * }		  
		 */
		
		int age = 18;
		
		if (age >=18 && age <= 80) 
		{
			System.out.println("It is hightime to get married");
		} 
		else if (age > 80 && age >= 129)
		{
			System.out.println("Pray to for good health");
		}
		else 
		{
			System.out.println("Too young");
		}
		
		
		

	}

}
