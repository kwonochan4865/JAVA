package chapter8.interfaceex;

public class Car14 {
	Tire11 frontLeftTire = new HankookTire12();
	Tire11 frontRightTire = new HankookTire12();
	Tire11 backLeftTire = new HankookTire12(); //Tire11라는 인터페이스 타입 필드 선언
	Tire11 backRightTire = new HankookTire12(); //초기 구현 객체 대입 
	

	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
