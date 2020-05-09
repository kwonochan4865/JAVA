package chapter12.multithread;

public class ThreadAfor6 extends Thread {
	public ThreadAfor6() {
		setName("ThreadA");
	} // 스레드 이름 설정

	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용"); // ThreadA 실행 내용
		}
	}
}
