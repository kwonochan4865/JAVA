package chapter9_nestedclassinfterface;

public class Main_2 {

	public static void main(String[] args) {
		A_1 a = new A_1();
		
		
		//인스턴스 멤버 클래스 객체 생성
		A_1.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		//정적 멤버 클래스 객체 생성 
		A_1.C c = new A_1.C();
		c.field1 = 3;
		c.method1();
		A_1.C.field2 = 3;
		A_1.C.method2();
		
		//로컬 클래스 객체 생성을 위한 메서드 호출 
		a.method();
	}
}
