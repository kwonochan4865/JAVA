package chapter6_class;

public class CalculatorExample_26 {

	public static void main(String[] args) {
		Calculator_25 myCalcu = new Calculator_25();
		
		//정사각형의 넓이 구하기 
		double result1 = myCalcu.areaRectangle(10);
		
		//직사각형의 넓이 구하기 
		double result2 = myCalcu.areaRectangle(10, 20);
		System.out.println(result1);
		System.out.println(result2);
		double xe =	myCalcu.areaRectangle(20);
		System.out.println(xe);
	}
}
