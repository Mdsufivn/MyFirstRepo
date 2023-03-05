package Encapsulation;

public class ATM {

	public static void main(String[] args) {
		
		Bank obj = new Bank();
		// obj.pinNumber = 1234;
		obj.updatePin(12345678, 1234, 1222);
		obj.drawMoney(12345678, 1234, 1000);


	}

}
