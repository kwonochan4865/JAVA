package chapter6_class;

public class CarExample_12 {

	public static void main(String[] args) {
		Car_11 car1 = new Car_11();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car_11 car2 = new Car_11("자가용");
		System.out.println("car.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car_11 car3 = new Car_11("자가용", "빨강");
		System.out.println("car3.company " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car_11 car4 = new Car_11("택시", "검정", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
	}
}
