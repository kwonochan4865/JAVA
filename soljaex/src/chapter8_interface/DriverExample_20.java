package chapter8_interface;

public class DriverExample_20 {

	public static void main(String[] args) {
		Driver_16 driver = new Driver_16();
		
		Bus_18 bus = new Bus_18();
		Taxi_19 taxi = new Taxi_19();
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
