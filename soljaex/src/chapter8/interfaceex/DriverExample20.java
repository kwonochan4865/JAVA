package chapter8.interfaceex;

public class DriverExample20 {

	public static void main(String[] args) {
		Driver16 driver = new Driver16();
		
		Bus18 bus = new Bus18();
		Taxi19 taxi = new Taxi19();
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
