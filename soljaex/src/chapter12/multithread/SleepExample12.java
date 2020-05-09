package chapter12.multithread;

import java.awt.Toolkit;

public class SleepExample12 {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000); // 3초 동안 메인 스레드를 일시 정지 상태로 만듦
			} catch (InterruptedException e) {
			}
		}
	}

}
