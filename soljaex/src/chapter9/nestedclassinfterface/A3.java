package chapter9.nestedclassinfterface;

public class A3 {
	int field1;
	void method1() { }

	static int field2;
	static void method2() { }
	
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	static class C {  //정적 클래스이기 때문에 인스턴스 필드와 인스턴스 메서드에는 접근 불
		void method() {
			//field1 = 10; //field1은 인스턴스 필드 
			//method1(); //method1()은 인스턴스 메서드 
			
			field2 = 10; //field2는 정적 필드 
			method2(); //method2()는 정적 메서드 
		}
	}
}


