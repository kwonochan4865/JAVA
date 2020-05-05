package chapter2.varandtype;

public class OperationPromotionExample_15 {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2; //기본 타입을 명시해주든가, 저장 타입을 int로 바꿔야 함   
		byte byteValue4 =  (byte)(byteValue1 + byteValue2);
		int intValue1 = byteValue1 + byteValue2; //자바의 기본 타입은 integer, double임 
		System.out.println(byteValue4);
		System.out.println(intValue1);

		
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2; //위와 마찬가지 
		char charValue4 = (char)(charValue1 + charValue2);
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
//		int intValue6 = 10 / 4.0; //저장 받는 타입이 int인데 자바의 기본 타입은 소수점 숫자일 경우 double이므로
									// 형변환을 하든지 저장 받는 값을 double로 하면 됨. 대신 출력값 다름 
		int intValue7 = (int) (10 / 4.0);

		double doubleValue = intValue5 / 4.0; 
		System.out.println(intValue7);
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result);
	}
}
