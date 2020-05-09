package chapter14.stream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStream;

public class ReadExample5 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test2.db");

		byte[] buffer = new byte[100]; // 길이 100인 배열 생성
		while (true) {
			int readByteNum = is.read(buffer);
			if (readByteNum == -1)
				break;
			for (int i = 0; i < readByteNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close();
	}
}
