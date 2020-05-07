package chapter8.interfaceex;

public class VehicleExample23 {

	public static void main(String[] args) {
		Vehicle17 vehicle = new Bus22();
		
		vehicle.run();
		
		Bus22 bus = (Bus22) vehicle; //강제 타입 변환 처음엔 Bus22를 Veicle17로 변환했으나 다시 역변환 
		
		bus.run();
		bus.checkFare();
	}
}
