package chapter8.interfaceex;

public class CarExample_15 {

	public static void main(String[] args) {
		Car_14 myCar = new Car_14();
		
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire_13();
		myCar.frontRightTire = new KumhoTire_13();
		
		myCar.run();
	}
}
