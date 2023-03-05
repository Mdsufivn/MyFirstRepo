package Exception_Handling;

import java.io.IOException;

public class Exception_Demo {

	public static void main(String[] args) {
		
		// "try" syntax will trigger "catch syntax with rules
		try {
		System.out.println("let us figure out an exceptions");
		String[] name = {"Class", "QA", "Java", "Eclipse"};
		
		// valid or invalid statement will trigger next action(s)
		System.out.println(name[3]);
		
		// This will print is outcome is valid
		System.out.println("Positive");
		
		// This will be the next trigger
		System.out.println("o my, I handled one");
		
		// will print the error with a rule
		} catch (Exception e) {
			System.out.println("Something is wrong " + e.getMessage());
			
		} //will print out of rule statements
		System.out.println("I am out of the catch block");
	}
}

		
