package chapter3_operator;

public class ConditionalOperationExample_11 {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
		int x = 10;
		int y = 20;
		int z = (++x); 
		int r = (y--);
		System.out.println(z);
		System.out.println(r);

	}
}
