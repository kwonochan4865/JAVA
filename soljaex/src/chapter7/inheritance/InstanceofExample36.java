package chapter7.inheritance;

public class InstanceofExample_36 {
	public static void method1(Parent_34 parent) {
	if(parent instanceof Child_35) {
		Child_35 child = (Child_35) parent;
		System.out.println("method1 - Child로 변환 성공");
	} else {
		System.out.println("method1 - Child로 변환되지 않음");
	}
}
	
	public static void method2(Parent_34 parent) {
		Child_35 child = (Child_35) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	public static void main(String[] args) {
		Parent_34 parentA = new Child_35();
		method1(parentA);
		method2(parentA);
		
		Parent_34 parentB = new Parent_34();
		method1(parentB);
		method2(parentB);
	}
}


