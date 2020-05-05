package chapter6_class;

public class Singleton_32 {
	private static Singleton_32 singleton = new Singleton_32();

	private Singleton_32() {}
	
	
	static Singleton_32 getInstace() {
		return singleton;
	}
}
