package assignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class VideoinfoRead {
	public static List<Video> readReader(Reader input) throws IOException {
		try { //
	BufferedReader br = new BufferedReader(new FileReader("./database.txt"));
	// .database.txt파일을 파일리더로 읽어오고 읽은 것들을 버퍼리퍼 객체로 생성
	String line; // while문에서 라인 한 줄을 line에 저장 후/버퍼로 읽어드린 파일이 공백이 아니라면, 이하 실행
	
	List<Video> infolist = new ArrayList<Video>();
	while((line= br.readLine()) !=null) { 
		String[] writeStr = line.split("∞"); // write가 리모콘인 배열을 만들어 ∞를 기준으로 잘라 담음
		
		if(writeStr.length !=3) continue; // ∞를 기준으로 자른 내용의 길이가 3개가 아니라면 계속(즉, 3개를 자르라는 말)
		Video personinfo = new Video(null); // PersonInfo 인스턴스 생성 (클래스 리모콘 만듦)
		personinfo.setTitle(writeStr[0]); // 자른 배열 중 0번 인덱스를 personinfo.setTitle에 담음
		personinfo.setSerialnum(Integer.parseInt(writeStr[1])); // 자른 배열 중 1번 인덱스를 personinfo.setNum에 담음
		personinfo.setOrder(Integer.parseInt(writeStr[1])); // 자른 배열 중 2번 인덱스를 personinfo.setInt에 담음

		infolist.add(personinfo); // infolist 배열에 personinfo 객체 인덱스들을 넣음
		// 즉, 위에 Title, Serialnum, Order 인덱스를 infolist 배열에 추가
	}	
	return infolist; // 외부에 infolist 반환 
		} finally {
			input.close(); //
		}
	}
}	
