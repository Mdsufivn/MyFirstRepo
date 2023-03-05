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
		
		// Another way of declaring 2D array
		int [][] array2 = {{4, 3, 5}, {6, 7, 8}};
		int length = array2.length;
		int length2 = array2[1].length;
		
		for (int i=0; i<length; i++) {
			for (int j=0; j<length2; j++) {
				System.out.println(array2[i][j]);
			}
		}
	}
}
	
		

