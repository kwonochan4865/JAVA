package chapter2.varandtype;

public class LongOperationExample14 {

	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100; 
		long value3 = 1000L;
		long result = value1 + value2 + value3; //자동 형변환이 됨  
		System.out.println(result);
	}

}
