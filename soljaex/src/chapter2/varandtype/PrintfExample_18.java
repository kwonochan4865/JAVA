package chapter2.varandtype;

public class PrintfExample_18 {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value);
		System.out.printf("상품의 가격:%6d원\n", value);
		System.out.printf("상품의 가격:%-6d원\n", value);
		System.out.printf("상품의 가격:%06d원\n", value);
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이%10.2f\n", 10, area); //왼쪽 공백이 소수점자리 제외 7번째 칸, 소수점 2번째 칸    

		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}

}
