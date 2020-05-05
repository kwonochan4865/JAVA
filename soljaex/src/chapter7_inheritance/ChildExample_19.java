package chapter7_inheritance;

public class ChildExample_19 {

	public static void main(String[] args) {
		Child_18 child = new Child_18();
		
		
		Parent_17 parent = child; //자동 타입 변환 
		parent.method1();
		parent.method2();
		//parent.method3();  // Child_18를 Parent_17로 형변환 했으므로 Child_18에 있는 method3()를 호출 하지 못함 
	}
}
