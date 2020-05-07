package chapter6.classexample;

public class Car11 {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	
	//생성자 
	Car11() {
	}

	Car11(String model) {
		this(model, "은색", 250);  //매개 변수는 
	}
	
	Car11(String model, String color) {
		this(model, color, 250);
	}
	
	Car11(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
