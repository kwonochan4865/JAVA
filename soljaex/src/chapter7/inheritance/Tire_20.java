package chapter7.inheritance;

public class Tire_20 {
	//필드
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	//생성자
	public Tire_20(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메서드
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " Tire 수명: : " +
		(maxRotation-accumulatedRotation) +"회");
			return true;
		} else {
			System.out.println("*** "+ location + " Tire 펑크 ***");
			return false;
		}
	}
}
