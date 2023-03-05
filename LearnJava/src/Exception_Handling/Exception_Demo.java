package Exception_Handling;

import java.io.IOException;

public class Exception_Demo {

	public static void main(String[] args) {
		try {
		System.out.println("let us figure out an exceptions");
		String[] name = {"Class", "QA", "Java", "Eclipse"};
		System.out.println(name[4]);

		System.out.println("o my, I handled one");
		
		} catch (Exception e) {
			System.out.println("Something is wrong " + e.getMessage());
		}
		System.out.println("I am out of the catch block");
	}
}

		
