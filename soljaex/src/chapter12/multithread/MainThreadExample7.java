package chapter12.multithread;

public class MainThreadExample7 {

	public static void main(String[] args) {
		Calculator8 calculator = new Calculator8();

		Userone9 user1 = new Userone9(); // User1 스레드 생성
		user1.setCalculator(calculator); // 공유 객체 설정
		user1.start(); // User1 스레드 시작

		Usertwo10 user2 = new Usertwo10(); // User2 스레드 생성
		user2.setCalculator(calculator); // 공유 객체 설정
		user2.start(); //User2 스레드 시작
	}

}
