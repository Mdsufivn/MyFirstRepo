package Variables;

public class Nest_Loop {

	public static void main(String[] args) {
		/* Create a nested loop
		* While loop
		* for 4
		* do while 5
		* it would itirate for 60 times
		*/
		 
		 int i = 0;
		 int count = 0;
		 
		 while (i<3) {
			 for (int j = 0; j <4; j++) {
				 
				 int k = 0;
				 do {
					 System.out.println("i-> " +i+ " j-> " + " <-> "+k);
					 k++;
					 count++;
				 }while  (k < 5);
			 }
			 i++;
		 }
		 System.out.println("The iteration count is : " + count);
	}


}
