package chapter12.multithread;

public class PrintThreadthree17 extends Thread {
	public void run() {
		while (true) {
			System.out.print("실행 중");
			if (Thread.interrupted()) {
				break;
			}
		}

		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}

}
