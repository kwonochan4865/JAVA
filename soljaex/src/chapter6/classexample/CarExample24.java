package chapter6.classexample;

public class CarExample24 {

	public static void main(String[] args) {
		Car23 myCar = new Car23();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도: " + speed + "km/h");
		
	}
}
