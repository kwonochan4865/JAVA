package chapter4_if;

public class BreakOutterExample_16 {
	public static void main(String[] args) {
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Outter; // Outer만 종료(lower는 종료 안됨)
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}
}
