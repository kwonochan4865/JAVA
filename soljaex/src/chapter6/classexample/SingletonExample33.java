package chapter6.classexample;

public class SingletonExample33 {

	public static void main(String[] args) {
		/*
		 * Singleton32 obj1 = new Singleton32();
		 * Singleton32 obj2 = new Singleton32(); // private 접근 제어자이므로 사용하려면 getInstance() 메서드를 사용해야 함 
		 */
		
		Singleton32 obj1 = Singleton32.getInstace();
		Singleton32 obj2 = Singleton32.getInstace();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}
