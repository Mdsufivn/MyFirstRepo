package FirstJava;

public class Adding_Numbers {

	public static void main(String[] args) {
		
		int sum = 0; 
		
		for(int i = 0; i<=15; i++)
				{
			sum = sum + i;
				}
		System.out.println("The results is : " + sum);
	}
}

		/** Alternative
		 * 
		 * 
		 * int sum = 0;
		 * int i = 0;
		 * while (i<15)
		 * {
		 * sum = sum + i;
		 * i++;
		 * }
		 */
		// Sum = 0
/*i = 0
i < 15 (every time i is smaller than 15, will loop)
i++ will do infinetly
sum = sum + 1
Query added itself by subtracting 1 going to 0 from 15 units to get =
120
/
