package chapter8.interfaceex;

public class Driver_24 {
	public void drive(Vehicle_17 vehicle) {
		if(vehicle instanceof Bus_18) { //조상님이 왼쪽, 포괄하는 것이 왼쪽 
			Bus_22 bus = (Bus_22) vehicle; //Bus_22클래스를 가지고 리모트하려면 강제 타입 변환 필요 
			bus.checkFare();
		}
		vehicle.run();
	}
}
