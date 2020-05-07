package chapter7.inheritance;

public class Dog41 extends Animal40 {

	public Dog41() {
		this.kind = "포유류";
	}
	@Override 
	public void sound() {
		System.out.println("야옹");
	}
}
