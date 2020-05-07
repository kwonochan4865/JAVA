package chapter6.classexample;

public class B_42 {
	public B_42() {
		A_41 a = new A_41();
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1; //private라 필드 접근 불가 
		
		a.method1();
		a.method2();
//		a.method3(); //private라 필드 접근 불가 
	}
}
