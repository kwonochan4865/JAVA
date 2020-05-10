package garbage;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class 파일저장중요 {
	public void setVideoTitle() throws IOException{//비디오 타이틀 생성자
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("비디오 개봉 년도를 입력하세요 : ");
			year = in.readLine();
			System.out.print("비디오 제목을 입력하세요 : ");
			title = in.readLine();
			System.out.print("비디오 감독을 입력하세요 : ");
			director = in.readLine();
/**
 * 밑에는 메소드로 한 번에 묶어서 처리할 것들임
 */
		Writer yy = new FileWriter("/home/ochan/ex/database.txt", true);
		this.year = year;
		this.title = title;
		this.director = director;
		yy.write(year+  "∞");
		yy.write(title + "∞");
		yy.write(director + "→");
		yy.write("\n");
		yy.flush();
		yy.close();
}
