package chapter12.multithread;

public class StopFlagExample13 {

	public static void main(String[] args) {
		PrintThreadone14 printThread = new PrintThreadone14();
		printThread.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		printThread.setStop(true);
	}

}
