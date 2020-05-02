package chapter7_inheritance;

public class KumhoTire_23 extends Tire_20{
	//필드
	//생성자
	public KumhoTire_23(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//메서드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "KumhoTire 수명: " +
					(maxRotation-accumulatedRotation) + "회");
			return true;
		} else;
		System.out.println("*** " + location + " KumhoTire 펑크 ***");
		return false;
	}
}
