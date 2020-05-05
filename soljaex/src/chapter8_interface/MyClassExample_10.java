package chapter8_interface;

public class MyClassExample_10 {

	public static void main(String[] args) {
		System.out.println("1)------------------");
		
		MyClass_9 myClass1 = new MyClass_9();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		System.out.println("2)-------------------");
		
		MyClass_9 myClass2 = new MyClass_9(new Audio_4());
		
		System.out.println("3)--------------------");
		
		MyClass_9 myClass3 = new MyClass_9();
		myClass3.methodA();
		
		System.out.println("4)------------------");
		
		MyClass_9 myClass4 = new MyClass_9();
		myClass4.methodB(new Television_3());
	}
}
