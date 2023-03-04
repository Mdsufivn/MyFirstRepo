package Data_Types;

public class SwitchDemo {

	public static void main(String[] args) {
		
		/** Switch Statement Syntax:
		 * 
		 * Switch(expression){
		 * case value1"
		 * //code to be executed
		 * break;
		 * case value2:
		 * //case to be executed
		 * break;
		 *  //code to be executed
		 *  case avlue3:
		 *  //code to be executed
		 * break;
		 * 
		 * default:
		 *  //code to be executed
		 * 
		 * }
		 * 
		 */

			int daynumber = 6;
			
			switch(daynumber){
			case 1:{
				System.out.println("It is Monday today!");
				}
			break;
			case 2:{
				System.out.println("It is Tuesday today!");
				}
			break;
			case 3:{
				System.out.println("It is Wednesday today!");
				}
			break;
			case 4:{
				System.out.println("It is Thursday today!");
			}
			break;
			case 5:{
				System.out.println("It is Friday today!");
			}
			break;
			case 6:{
				System.out.println("It is Saturday today!");
			}
			break;
			
			default:
				System.out.println("Sorry it is not a day!!");
			
			}
	}

}
