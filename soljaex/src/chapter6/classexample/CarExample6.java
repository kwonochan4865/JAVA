package chapter6.classexample;

public class CarExample6 {

	public static void main(String[] args) {
		Car5 myCar = new Car5("검정", 3000);
		//Car myCar = new Car(); // 새로운 인스턴스 생성시 Car5 클래스에 생성자 선언이 있으므로, 명시적으로 "선언된" 생성자를 호출해야 함(Car5클래스의 "선언된" 생성자는 2개의 매개값을 가지고 있는 상태임)
	}

}
