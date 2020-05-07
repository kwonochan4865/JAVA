package chapter8.interfaceex;

public class HankookTire12 implements Tire11 {
	@Override 
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다.");
	}
}
