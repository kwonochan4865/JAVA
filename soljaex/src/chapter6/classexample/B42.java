package chapter6.classexample;

public class B42 {
	public B42() {
		A41 a = new A41();
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1; //private라 필드 접근 불가 
		
		a.method1();
		a.method2();
//		a.method3(); //private라 필드 접근 불가 
	}
}
