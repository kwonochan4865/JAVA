package chapter9.nestedclassinfterface;

public class Otter4 {
	//자바 7 이하 버전에서는 로컬 클래스에서 사용되는 매개 변수나 로컬 변수의 값을 final로 지정했어야 하나, 자바 8부터는 
	// 붙이지 않아도 final 특성을 부여해준다.

	//자바 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	//자바 8 이후
	public void method2(int arg) {
		int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
