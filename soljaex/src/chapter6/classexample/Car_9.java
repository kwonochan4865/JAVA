package chapter6.classexample;

public class Car_9 {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	
	//생성자
	Car_9() {
	}                //클래스엔 4개의 필드가 있으나, 매개변수를 선언 안하고 생성자만 선언


	Car_9(String model) {
		this.model = model;          //4개의 필드 중 첫 번째 model을 같은 이름의 model로 선언 (this.model)
	}
	
	Car_9(String model, String color) {
		this.model = model;           //이하 같음 변수만 더 많아짐
		this.color = color;
	}
	Car_9(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
