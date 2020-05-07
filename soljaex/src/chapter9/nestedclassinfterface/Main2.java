package chapter9.nestedclassinfterface;

public class Main2 {

	public static void main(String[] args) {
		A1 a = new A1();
		
		
		//인스턴스 멤버 클래스 객체 생성
		A1.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		//정적 멤버 클래스 객체 생성 
		A1.C c = new A1.C();
		c.field1 = 3;
		c.method1();
		A1.C.field2 = 3;
		A1.C.method2();
		
		//로컬 클래스 객체 생성을 위한 메서드 호출 
		a.method();
	}
}
