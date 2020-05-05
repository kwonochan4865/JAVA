package chapter8.interfaceex;

public class DriverExample_25 {

	public static void main(String[] args) {
		Driver_24 driver = new Driver_24();
		
		Bus_22 bus = new Bus_22();
		Taxi_19 taxi = new Taxi_19();
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}
