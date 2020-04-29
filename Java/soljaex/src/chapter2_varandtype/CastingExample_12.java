package chapter2_varandtype;

public class CastingExample_12 {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;   //double로 선언했지만 
		intValue = (int)doubleValue; //int로 형변환했으므로 소수점 탈락  
		System.out.println(intValue);
	}
}
