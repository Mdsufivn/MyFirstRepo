package Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throwable_Demo {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		System.out.println("Exception handling does not make and sense to me");
		Thread.sleep(3000); 
		FileInputStream fis = new FileInputStream(""); //Input any file not in your package or project, will input.
		System.out.println("May be it was something, not sure about");

	} 

}
