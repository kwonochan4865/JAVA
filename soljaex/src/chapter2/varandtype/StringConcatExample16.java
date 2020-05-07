package chapter2.varandtype;

public class StringConcatExample_16 {

	public static void main(String[] args) {
		//숫자 연산 
		int value = 10 + 2 + 8;
		System.out.println("value: " + value);
		
		//문자열 결합 연산
		String str1 = 10 + 2 + "8";
		System.out.println("str1: " + str1);
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2: " + str2);
		
		String str3 = "10" + 2 + 8; //String은 전부 문자로 인식 
		System.out.println("str3: " + str3);

		String str4 = "10" + (2 + 8); // 괄호 치면 숫자로 인식 
		System.out.println("str4: " + str4);
	}

}