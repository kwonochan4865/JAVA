package chapter8_interface;

public class SmartTelevisionExample_8 {

	public static void main(String[] args) {
		SmartTelevision_7 tv = new SmartTelevision_7();
		
		RemoteControl_2 rc = tv;
		Searchable_6 searchable = tv;
	}
}
