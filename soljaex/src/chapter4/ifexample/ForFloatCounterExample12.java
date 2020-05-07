package chapter4.ifexample;

public class ForFloatCounterExample12 {

	public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) { //float는 0.1을 완전히 담을 수 없음. 고로 9번만 반복됨
			System.out.println(x);
		}
	}
}
