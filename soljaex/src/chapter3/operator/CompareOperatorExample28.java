package chapter3.operator;

public class CompareOperatorExample28 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // 받을 땐 언제나 int로 받아 true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); // float는 0.1을 정확히 표현할 수 없음. 0.1f는 0.1의 근사값임 고로 false
		System.out.println((float)v4 == v5); // v4도 float로 바꿨으니 둘다 0.1의 근사값 고로 true
	}

}
