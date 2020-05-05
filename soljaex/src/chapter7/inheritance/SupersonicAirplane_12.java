package chapter7.inheritance;

public class SupersonicAirplane_12 extends Airplane_11 {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override 
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else { 
			super.fly(); //Airplane_11의 fly() 메서드 호출 
		}
	}
}
