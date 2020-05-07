package chapter7.inheritance;

public class SupersonicAirplaneExample13 {

	public static void main(String[] args) {
		SupersonicAirplane12 sa = new SupersonicAirplane12();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane12.SUPERSONIC;
		sa.fly();
		sa.land();
	}
}
