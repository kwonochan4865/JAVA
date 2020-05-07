package chapter7.inheritance;

public class ChildExample19 {

	public static void main(String[] args) {
		Child18 child = new Child18();
		
		
		Parent17 parent = child; //자동 타입 변환 
		parent.method1();
		parent.method2();
		//parent.method3();  // Child18를 Parent17로 형변환 했으므로 Child18에 있는 method3()를 호출 하지 못함 
	}
}
