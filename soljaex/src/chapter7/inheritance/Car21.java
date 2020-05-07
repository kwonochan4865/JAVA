package chapter7.inheritance;

public class Car21 {
	//필드
	Tire20 frontLeftTire = new Tire20("앞왼쪽", 6);
	Tire20 frontRightTire = new Tire20("앞오른쪽", 2);
	Tire20 backLeftTire = new Tire20("뒤왼쪽", 3);
	Tire20 backRightTire = new Tire20("뒤오른쪽", 4);
	
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
