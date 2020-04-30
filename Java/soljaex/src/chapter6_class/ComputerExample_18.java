package chapter6_class;

public class ComputerExample_18 {

	public static void main(String[] args) {
		Computer_17 myCom = new Computer_17();
		
		int[] values1 = {1, 2, 3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1: " + result1);
		
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("result2: " + result2);
		
//		int result3 = myCom.sum2(1, 2, 3);
//		System.out.println("result3: " + result3);
//		
//		int result4 = myCom.sum2(1, 2, 3, 4, 5);
//		System.out.println("result4: " + result4);
		
	}

}
