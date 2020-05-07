package chapter7.inheritance;

public class AnimalExample43 {

	public static void main(String[] args) {
		Dog41 dog = new Dog41();
		Cat42 cat = new Cat42();
		System.out.println("--------");
		
		//변수의 자동 타입 변환
		Animal40 animal = null;
		animal = new Dog41();
		animal.sound();
		System.out.println("----------");
		
		//메서드의 다형성
		animalSound(new Dog41());
		animalSound(new Cat42());
		
	}
	public static void animalSound(Animal40 animal) {
		animal.sound();
	}
}
