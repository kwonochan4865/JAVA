package chapter9_nestedclassinfterface;

public class Outter_5 {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	
	class Nested {
		String field = "Nestd-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(this.field);
			this.method(); //중첩 객체 참조 	
			System.out.println(Outter_5.this.field);
			Outter_5.this.method(); //바깥 객체 참조  
		}
	}
}
