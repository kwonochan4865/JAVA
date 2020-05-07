package chapter8.interfaceex;

public class CarExample15 {

	public static void main(String[] args) {
		Car14 myCar = new Car14();
		
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire13();
		myCar.frontRightTire = new KumhoTire13();
		
		myCar.run();
	}
}
