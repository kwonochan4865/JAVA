package chapter7.inheritance;

public class DriverExample_30 {

	public static void main(String[] args) {
		Driver_27 driver = new Driver_27();
		Bus_28 bus = new Bus_28();
		Taxi_29 taxi = new Taxi_29();
		
		driver.drive(bus); // Bus_28과 Taxi_29는 Vehicle_26의 자손 객체이고, 해당 객체의 run() 메서드를 재정의 하고 있음
		//Driver_27엔 drive라는 메서드로 Vehicle_26의 run()메서드를 호출하고 있음
							 
		driver.drive(taxi);
	}

}
