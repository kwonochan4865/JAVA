package chapter3_operator;

public class CharOperationExample_14 {

	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		//char c3 = c2 + 1; //산술 결과는 int로 나오므로  A 유니코드 65 + 1 = 66
		System.out.println("c1: "+ c1);
		System.out.println("c2: "+ c2);
		//System.out.println("c3: " + c3);
	}
}
