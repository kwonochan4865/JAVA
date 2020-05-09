package chapter12.multithread;

public class InterruptExample15 {

	public static void main(String[] args) {
		Thread thread = new PrintThreadtwo16();
		thread.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		thread.interrupt(); // 스레드 종료를 위해 InterruptedException을 발생시킴

	}
}
