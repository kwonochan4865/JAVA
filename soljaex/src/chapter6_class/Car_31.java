package chapter6_class;

public class Car_31 {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	public static void main(String[] args) {
		Car_31 myCar = new Car_31();
		myCar.speed = 60;
		myCar.run();
		
	}

}
