package assignment1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VideoinfoRead {
	private static String title;
	private static String barcodenum;
	private static String director;
	private static String openyear;

//static List<VideoCode> personinfo = new ArrayList<VideoCode>();
//public static List<VideoCode> VideoinfoRead(Reader input) throws IOException {
//	try { //
//		BufferedReader br = new BufferedReader(new FileReader("./database.txt"));
//		// .database.txt파일을 파일리더로 읽어오고 읽은 것들을 버퍼리퍼 객체로 생성
//		String line; // while문에서 라인 한 줄을 line에 저장 후/버퍼로 읽어드린 파일이 공백이 아니라면, 이하 실행
//		List<VideoCode> personinfo = new ArrayList<VideoCode>();

//		while ((line = br.readLine()) != null) { // 읽어드린 값이 null객체가 아니라면
//			String[] writeStr = line.split("%"); // write가 리모콘인 배열을 만들어 ∞를 기준으로 잘라 담음
//			if (writeStr.length != 4)
//				continue; // ∞를 기준으로 자른 내용의 길이가 4개가 아니라면 계속(즉, 4개를 자르라는 말)
//			
//			VideoCode vc = new VideoCode(); // PersonInfo 인스턴스 생성 (클래스 리모콘 만듦)
//			vc.setTitle(writeStr[0]); // 자른 배열 중 0번 인덱스를 personinfo.setTitle에 담음
//			vc.setBarcodenum(writeStr[1]); // 자른 배열 중 1번 인덱스를 personinfo.setBarcodenum에 담음
//			vc.setDirector(writeStr[2]); // 자른 배열 중 2번 인덱스를 personinfo.setDirector에 담음
//			vc.setOpenyear(writeStr[3]); // 자른 배열 중 3번 인덱스를 personinfo.setOpenyear에 담음
//			title = vc.getTitle();
//			barcodenum = vc.getBarcodenum();
//			Director = vc.getDirector();
//			Openyear = vc.getOpenyear();
//
//			personinfo.add(vc); // VideoCode 배열에 personinfo 객체 인덱스들을 넣음
//			// 즉, 위에 Title, Serialnum, Order 인덱스를 infolist 배열에 추가
//		}
//		return personinfo; // 외부에 infolist 반환
//	} finally {
//		input.close(); //
//	}
//}	
	public static void Input() throws IOException {
		Vector<VideoCode> personinfo = new Vector<VideoCode>();
		String line; // while문에서 라인 한 줄을 line에 저장 후/버퍼로 읽어드린 파일이 공백이 아니라면, 이하 실행
		VideoCode vc = new VideoCode();
		title = vc.getTitle();
		barcodenum = vc.getBarcodenum();
		director = vc.getDirector();
		openyear = vc.getOpenyear();

		BufferedReader br = new BufferedReader(new FileReader("./database.txt"));
		line = br.readLine();
		
		while((line=br.readLine()) !=null) {
			String[] ln = line.split("∞");
			if(ln.length !=4) continue;
			title(ln[0]);
			
		}
	}

/////////////////////////////////////////////////////getter and setter
	public static String getTitle() {
		return title;
	}

	public static void setTitle(String title) {
		VideoinfoRead.title = title;
	}

	public static String getBarcodenum() {
		return barcodenum;
	}

	public static void setBarcodenum(String barcodenum) {
		VideoinfoRead.barcodenum = barcodenum;
	}

	public static String getDirector() {
		return director;
	}

	public static void setDirector(String director) {
		director = director;
	}

	public static String getOpenyear() {
		return openyear;
	}

	public static void setOpenyear(String openyear) {
		openyear = openyear;
	}
}
