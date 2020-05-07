package chapter7.inheritance;

public class KumhoTire23 extends Tire20{
	//필드
	//생성자
	public KumhoTire23(String location, int maxRotation) {
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
