package chapter12.multithread;

public class Usertwo10 extends Thread {
	private Calculator8 calculator;

	public void setCalculator(Calculator8 calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}

	public void run() {
		calculator.setMemory(50);
	}
}
