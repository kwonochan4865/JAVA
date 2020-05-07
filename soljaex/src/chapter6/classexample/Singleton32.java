package chapter6.classexample;

public class Singleton32 {
	private static Singleton32 singleton = new Singleton32();

	private Singleton32() {}
	
	
	static Singleton32 getInstace() {
		return singleton;
	}
}
