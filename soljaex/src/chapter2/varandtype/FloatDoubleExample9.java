package chapter2.varandtype;

public class FloatDoubleExample9 {

	public static void main(String[] args) {
		//실수값 저장 예제
		//float var1 = 3.14; 자바의 기본 타입이 double이니 float타입이라고 명시(f) 
		float var2 = 3.14f;
		double var3 = 3.14;
		
		//정밀도 테스트
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5); // double vs float
		
		//e(자리수)
		double var6 = 3e6;
		float var7 = 3e6F;
		double var8 = 2e-3;
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8; " + var8);
		
	}
}
