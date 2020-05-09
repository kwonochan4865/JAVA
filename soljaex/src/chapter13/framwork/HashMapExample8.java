package chapter13.framwork;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample8 {
	public static void main(String[] args) {
		Map<Student7, Integer> map = new HashMap<Student7, Integer>();
		
		map.put(new Student7(1, "홍길동"), 95);
		map.put(new Student7(1, "홍길동"), 95);
		
		System.out.println("총 Entry 수: " + map.size()); // 저장된 총 Map.Entry 수 얻기
	}
}
