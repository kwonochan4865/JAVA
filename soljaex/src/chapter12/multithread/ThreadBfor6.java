package chapter12.multithread;

public class ThreadBfor6 extends Thread {

	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
