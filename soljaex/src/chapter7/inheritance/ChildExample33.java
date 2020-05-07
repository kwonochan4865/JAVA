package chapter7.inheritance;

public class ChildExample33 {

	public static void main(String[] args) {
		Parent31 parent = new Child32(); //자동 타입 변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		 * parent.field2 = "data2";
		 * parent.method3();
		 */
		
		Child32 child = (Child32) parent; //강제 타입 변환
		child.field2 = "yyy";
		child.method3();
	}

}
