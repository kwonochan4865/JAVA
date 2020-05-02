package chapter7_inheritance;

public class HankookTire_22 extends Tire_20{
	//필드
	//생성자
	public HankookTire_22(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//메서드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " HankookTire 수명: " +
		(maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
		
	}
}
