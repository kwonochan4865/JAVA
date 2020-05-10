package chapter14.stream;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class GetLineStringFromKeyboard21 {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader); // InputStream을 Reader로 변환하고 다시 BufferedReader를 연결

		while (true) {
			System.out.print("입력하세요: ");
			String lineStr = br.readLine(); // 라인 단위로 문자열을 읽음
			if (lineStr.contentEquals("q") || lineStr.equals("quit")) // q or quit를 읽었을 때 while 반복문 종료
				break;
			System.out.print("입력된내용: " + lineStr);
			System.out.println();
		}

		br.close();
	}
}
