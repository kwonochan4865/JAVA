package chapter6.classexample;

public class CarExample4 {

	public static void main(String[] args) {
		//객체 생성
		Car3 myCar = new Car3();
		
		//필드값 읽기
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: "  + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		//필드값 변경
		myCar.maxSpeed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
	}
}
