package chapter6_class;

public class CalculatorExample_14 {

	public static void main(String[] args) {
		Calculator_13 myCalc = new Calculator_13();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: " + result2);
	}
}
