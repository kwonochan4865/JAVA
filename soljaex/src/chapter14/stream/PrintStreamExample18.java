package chapter14.stream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample18 {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/printstream.txt");
		PrintStream ps = new PrintStream(fos); // 바이트 기반 출력 스트림을 생성하고 printStream 보조 스트림 연결

		ps.println("[프린터 보조 스트림]");
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼");
		ps.println("데이터를 출력합니다.");

		ps.flush();
		ps.close();
	}
}
