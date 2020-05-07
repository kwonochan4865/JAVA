package chapter6.classexample;

public class CalculatorExample26 {

	public static void main(String[] args) {
		Calculator25 myCalcu = new Calculator25();
		
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
