package chapter14.stream;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample12 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test8.txt");

		char[] buffer = new char[100]; // 길이 100인 배열 생성

		while (true) {
			int readCharNum = reader.read(buffer); // 배열 길이만큼 읽기
			if (readCharNum == -1) // 읽은 문자 수만큼 반복하면서 배열에 저장된 문자를 출력
				break;
			for (int i = 0; i < readCharNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		reader.close(); // 입력 스트림을 닫음
	}

}
