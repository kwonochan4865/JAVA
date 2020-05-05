package chapter7_inheritance;

public class SupersonicAirplaneExample_13 {

	public static void main(String[] args) {
		SupersonicAirplane_12 sa = new SupersonicAirplane_12();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane_12.SUPERSONIC;
		sa.fly();
		sa.land();
	}
}
