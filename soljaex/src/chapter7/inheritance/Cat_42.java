package chapter7.inheritance;

public class Cat_42 extends Animal_40 {
	public Cat_42() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
