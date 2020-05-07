package chapter6.classexample;

public class Calculator_15 {
	
	//메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		System.out.println("result2: " + result);
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
