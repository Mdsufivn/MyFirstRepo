package FirstJava;

public class AssignmentOperator {

	public static void main(String[] args) {

		/** Assignment Operators ( =. +=, -=, *=, /= and %=)
		 * a = 7 means a = 7
		 * a+ = 7means a = a+7
		 * a- = 7means a = a-7
		 * a* = 7means a = a*7
		 * a/ = 7means a = a/7
		 * a% = 7means a = a%7
		 */
		// Examples:
		int a = 87;
		int result = a-7;
		int result1 = a/7;
		
		System.out.println(a+=7);//94
		System.out.println(result);//80
		System.out.println(a*=7);//658
		System.out.println(result1);//12
		System.out.println(a%=7);//0

		
		
		
	}
}