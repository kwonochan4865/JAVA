package chapter7.inheritance;

public class InstanceofExample36 {
	public static void method1(Parent34 parent) {
	if(parent instanceof Child35) {
		Child35 child = (Child35) parent;
		System.out.println("method1 - Child로 변환 성공");
	} else {
		System.out.println("method1 - Child로 변환되지 않음");
	}
}
	
	public static void method2(Parent34 parent) {
		Child35 child = (Child35) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	public static void main(String[] args) {
		Parent34 parentA = new Child35();
		method1(parentA);
		method2(parentA);
		
		Parent34 parentB = new Parent34();
		method1(parentB);
		method2(parentB);
	}
}


