package chapter12.multithread;

public class PrintThreadtwo16 extends Thread {
	public void run() {
		try {
			while (true) {
				System.out.println("실행 중");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {
		} // InterruptedException 발생

		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
