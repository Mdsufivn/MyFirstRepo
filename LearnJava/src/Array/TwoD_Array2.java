package Array;

public class TwoD_Array2 {

	public static void main(String[] args) { 
		// 
		int [][] my2darray = new int [2][3];
		
		//this is the first array, starts with 0 along with values and names for values
		my2darray [0][0] = 5;
		my2darray [0][1] = 6;
		my2darray [0][2] = 7;
		
		//this is the second array with the same concept
		my2darray [1][0] = 8;
		my2darray [1][1] = 9;
		my2darray [1][2] = 3;
		
		//I am printing the value from the second array and second value
		System.out.println(my2darray[1][1]);
		
		// 
		
		
		
		int lenghtFirstArray = my2darray.length;		
		int lenght2ndArray = my2darray[0].length;
		System.out.println("Lenght of 2 Day arra");
		System.out.println(lenghtFirstArray);		
		System.out.println(lenght2ndArray);
		
		System.out.println("Caputring all the values from the 2d array");
		for (int i=0; i<my2darray.length; i++)
			
		{
			for (int j=0; j<my2darray[0].length; j++) 
			{
				System.out.println(my2darray[i][j]);
			}
					
		}
		
	}
	
}
		

