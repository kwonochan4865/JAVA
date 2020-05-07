package chapter6.classexample;

public class Car27 {
	//필드
	String model;
	int Speed;
	
	//생성자
	Car27(String model) {
		this.model = model;
	}
	
	//메소드 
	void setSpeed(int speed) {
		this.Speed = speed;
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속:" + this.Speed + "km/h)");
		}
	}
}
