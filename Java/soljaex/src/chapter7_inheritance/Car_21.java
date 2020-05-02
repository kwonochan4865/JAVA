package chapter7_inheritance;

public class Car_21 {
	//필드
	Tire_20 frontLeftTire = new Tire_20("앞왼쪽", 6);
	Tire_20 frontRightTire = new Tire_20("앞오른쪽", 2);
	Tire_20 backLeftTire = new Tire_20("뒤왼쪽", 3);
	Tire_20 backRightTire = new Tire_20("뒤오른쪽", 4);
	
	//생성자
	//메서드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) { stop(); return 1; }
		if(frontRightTire.roll()==false) { stop(); return 2; }
		if(backLeftTire.roll()==false) { stop(); return 3; }
		if(backRightTire.roll()==false) { stop(); return 4; }
		return 0;
	}
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
