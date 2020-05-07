package chapter8.interfaceex;

public class Driver24 {
	public void drive(Vehicle17 vehicle) {
		if(vehicle instanceof Bus18) { //조상님이 왼쪽, 포괄하는 것이 왼쪽 
			Bus22 bus = (Bus22) vehicle; //Bus22클래스를 가지고 리모트하려면 강제 타입 변환 필요 
			bus.checkFare();
		}
		vehicle.run();
	}
}
