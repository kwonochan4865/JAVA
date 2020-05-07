package chapter3.operator;

public class SignOperatorExample1 {
	public static void main (String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result=" + result1);
		System.out.println("result2=" + result2);
		
		
		byte b = 100;
		//byte result3 = -b; //값을 byte로 넣었더라도 다시 저장할 땐 int타입으로 바뀜 (자바의 기본 부호 연산 결과는 int타입임)
		int result3 = -b;
		System.out.println("result3=" + result3);
		
		
	}
}
