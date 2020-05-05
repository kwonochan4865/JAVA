package chapter7_inheritance;

public class AnimalExample_43 {

	public static void main(String[] args) {
		Dog_41 dog = new Dog_41();
		Cat_42 cat = new Cat_42();
		System.out.println("--------");
		
		//변수의 자동 타입 변환
		Animal_40 animal = null;
		animal = new Dog_41();
		animal.sound();
		System.out.println("----------");
		
		//메서드의 다형성
		animalSound(new Dog_41());
		animalSound(new Cat_42());
		
	}
	public static void animalSound(Animal_40 animal) {
		animal.sound();
	}
}
