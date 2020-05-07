package chapter8.interfaceex;

public class MyClassExample10 {

	public static void main(String[] args) {
		System.out.println("1)------------------");
		
		MyClass9 myClass1 = new MyClass9();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		System.out.println("2)-------------------");
		
		MyClass9 myClass2 = new MyClass9(new Audio4());
		
		System.out.println("3)--------------------");
		
		MyClass9 myClass3 = new MyClass9();
		myClass3.methodA();
		
		System.out.println("4)------------------");
		
		MyClass9 myClass4 = new MyClass9();
		myClass4.methodB(new Television3());
	}
}
