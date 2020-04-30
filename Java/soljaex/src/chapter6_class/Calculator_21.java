package chapter6_class;

public class Calculator_21 {

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y); // 
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10); //avg메서드에 7과 10은 plus메서드를 거쳐 17이 됨 
		println("실행결과: " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
