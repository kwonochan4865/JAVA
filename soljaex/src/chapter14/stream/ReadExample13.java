package chapter14.stream;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample13 {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test9.txt");

		char[] buffer = new char[5];

		int readCharNum = reader.read(buffer, 2, 3); // 입력 스트림으로부터 3개의 문자를 읽고 buffer[2], buffer[3], buffer[4]에 각각 저장
		if (readCharNum != -1) {
			for (int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}

		reader.close();
	}
}
