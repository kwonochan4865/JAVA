package chapter12.multithread;

public class Userone9 extends Thread {
	private Calculator8 calculator;
	
	public void setCalculator(Calculator8 calculator) {
		this.setName("User1"); // 스레드 이름을 User1으로 저장
		this.calculator = calculator; // 공유 객체인 Calculator8을 필드에 저장
	}
	
	public void run() {
		calculator.setMemory(100); //공유 객체인 Calculator8의 메모리에 100을 저장
	}
}
