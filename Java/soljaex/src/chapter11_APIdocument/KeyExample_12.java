package chapter11_APIdocument;

import java.util.HashMap;

public class KeyExample_12 {

	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 StriHashMap<K, V>장하는 HashMap 객체 생성
		HashMap<Key_11, String> hashMap = new HashMap<Key_11, String>();
		
		//식별키 new Key(1)로 "홍길동"을 저장함
		hashMap.put(new Key_11(1), "홍길동");
	}

}
