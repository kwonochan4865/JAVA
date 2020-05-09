package chapter12.multithread;

public class ThreadNameExample6 {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread(); // 이 코드를 실행하는 스레드 객체 얻기
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());

		ThreadAfor6 threadA = new ThreadAfor6();
		System.out.println("작업 스레드 이름: " + threadA.getName()); // 스레드 이름 얻기
		threadA.start();

		ThreadBfor6 threadB = new ThreadBfor6();
		System.out.println("작업 스레드 이름: " + threadB.getName()); // 스레드 이름 얻기
		threadB.start();
	}

}
