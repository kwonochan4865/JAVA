package chapter8.interfaceex;

public class SmartTelevisionExample8 {

	public static void main(String[] args) {
		SmartTelevision7 tv = new SmartTelevision7();
		
		RemoteControl2 rc = tv;
		Searchable6 searchable = tv;
	}
}
