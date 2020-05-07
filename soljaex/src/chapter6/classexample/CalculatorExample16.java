package chapter6.classexample;

public class CalculatorExample16 {

	public static void main(String[] args) {
		Calculator15 myCalc = new Calculator15();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);
		
		byte x = 10;
		byte y = 4;
		myCalc.divide(x, y);
		myCalc.powerOff();
	}
}
