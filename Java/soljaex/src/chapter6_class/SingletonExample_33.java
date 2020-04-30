package chapter6_class;

public class SingletonExample_33 {

	public static void main(String[] args) {
		/*
		 * Singleton_32 obj1 = new Singleton_32();
		 * Singleton_32 obj2 = new Singleton_32(); // private 접근 제어자이므로 사용하려면 getInstance() 메서드를 사용해야 함 
		 */
		
		Singleton_32 obj1 = Singleton_32.getInstace();
		Singleton_32 obj2 = Singleton_32.getInstace();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}
