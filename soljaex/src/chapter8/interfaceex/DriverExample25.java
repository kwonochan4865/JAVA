package chapter8.interfaceex;

public class DriverExample25 {

	public static void main(String[] args) {
		Driver24 driver = new Driver24();
		
		Bus22 bus = new Bus22();
		Taxi19 taxi = new Taxi19();
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}
