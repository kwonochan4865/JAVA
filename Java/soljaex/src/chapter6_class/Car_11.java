package chapter6_class;

public class Car_11 {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	
	//생성자 
	Car_11() {
	}

	Car_11(String model) {
		this(model, "은색", 250);  //매개 변수는 
	}
	
	Car_11(String model, String color) {
		this(model, color, 250);
	}
	
	Car_11(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
