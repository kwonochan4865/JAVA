package chapter7.inheritance;

public class HankookTire22 extends Tire20{
	//필드
	//생성자
	public HankookTire22(String location, int maxRotation) {
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
