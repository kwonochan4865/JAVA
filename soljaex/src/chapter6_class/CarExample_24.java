package chapter6_class;

public class CarExample_24 {

	public static void main(String[] args) {
		Car_23 myCar = new Car_23();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도: " + speed + "km/h");
		
	}
}
