package chapter7.inheritance;

public class Cat42 extends Animal40 {
	public Cat42() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
