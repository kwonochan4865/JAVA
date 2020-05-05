package chapter8.interfaceex;

public class Car_14 {
	Tire_11 frontLeftTire = new HankookTire_12();
	Tire_11 frontRightTire = new HankookTire_12();
	Tire_11 backLeftTire = new HankookTire_12(); //Tire_11라는 인터페이스 타입 필드 선언
	Tire_11 backRightTire = new HankookTire_12(); //초기 구현 객체 대입 
	

	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
