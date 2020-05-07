package chapter7.inheritance;

public class DriverExample30 {

	public static void main(String[] args) {
		Driver27 driver = new Driver27();
		Bus28 bus = new Bus28();
		Taxi29 taxi = new Taxi29();
		
		driver.drive(bus); // Bus28과 Taxi29는 Vehicle26의 자손 객체이고, 해당 객체의 run() 메서드를 재정의 하고 있음
		//Driver27엔 drive라는 메서드로 Vehicle26의 run()메서드를 호출하고 있음
							 
		driver.drive(taxi);
	}

}
