package chapter12.multithread;

public class DaemonExample19 {

	public static void main(String[] args) {
		AutoSaveThread18 autoSaveThread = new AutoSaveThread18();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println("메인 스레드 종료");

	}
}
