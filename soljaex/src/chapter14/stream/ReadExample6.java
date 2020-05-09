package chapter14.stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample6 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test3.db"); // 데이터 출발지를 test3.db로 하는 바이트 기반 파일 입력 스트림 생성

		/*
		 * TODO VideoRentalShop 써먹을 것
		 */
		byte[] buffer = new byte[5];

		int readByteNum = is.read(buffer, 2, 3); // 입력 스트림으로부터 3byte를 읽고 buffer[2].buffer[3], buffer[4]에 각각 저장
		if (readByteNum != -1) { // 읽은 바이트가 있다면
			for (int i = 0; i < buffer.length; i++) {
				System.out.println("buffer[i]"); // 배열 전체를 읽고 출력
			}
		}

		is.close(); // 입력 스트림 닫음
	}
}
