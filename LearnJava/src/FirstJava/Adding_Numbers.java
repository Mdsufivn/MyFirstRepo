package FirstJava;

public class Adding_Numbers {

	public static void main(String[] args) {
		
		int sum = 0; 
		for(int i = 0; i<=15; i++)
				{
			sum = sum + i;
				}
		System.out.println("The results is : " + sum);
			
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
	}

}
