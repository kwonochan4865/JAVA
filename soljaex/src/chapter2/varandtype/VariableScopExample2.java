package chapter2.varandtype;

public class VariableScopExample_2 {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
		}
//		int v3 = v1 + v2 + 5;  변수 선언이 if문 내부에 돼 있어 컴파일 에러
	}

}
