package chapter4.ifexample;

public class ForSumFrom1To100Example2_11 {

	public static void main(String[] args) {
		int sum = 0;
		int i= 0;
		for(i=1; i<=100; i++) {
			sum += i;
		}

		System.out.println("1~" + (i-1) + " 합: " + sum); //i를 for문 밖에서 선언했기 때문에 밖에서도 출력 가능
	}
}
