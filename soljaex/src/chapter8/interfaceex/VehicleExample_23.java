package chapter8.interfaceex;

public class VehicleExample_23 {

	public static void main(String[] args) {
		Vehicle_17 vehicle = new Bus_22();
		
		vehicle.run();
		
		Bus_22 bus = (Bus_22) vehicle; //강제 타입 변환 처음엔 Bus_22를 Veicle_17로 변환했으나 다시 역변환 
		
		bus.run();
		bus.checkFare();
	}
}
