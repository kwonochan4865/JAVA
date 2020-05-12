package assignment1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class VideoCode {
	private String title;
	private String barcodenum;
	private String director;
	private String openyear;
 
	public VideoCode() throws IOException {
		this.setEnrolledVideoinfo(); // 실행 구문
	}

	public void setEnrolledVideoinfo() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("비디오 제목을 입력해주세요: ");
			title = in.readLine();
			System.out.print("비디오 감독을 입력해주세요: ");
			director = in.readLine();
			System.out.print("비디오 바코드 번호를 입력해주세요: ");
			barcodenum = in.readLine();
			System.out.print("비디오 개봉 년도를 입력해주세요: ");
			openyear = in.readLine();
		} catch (IOException e) {
			System.err.print("비디오 등록 오류");
			e.printStackTrace();
		
		}
	}
//	public void Hashset() {
//		setEnrolledVideoinfo();
//		HashMap<title, > map = new HashMap<title, barcodenum>();
//	}
//////////////////////////////////////////////////////Getter and Setter
	public void setTitle(String title) {
		this.title = title;
	}

	public void setBarcodenum(String barcodenum) {
		this.barcodenum = barcodenum;
	}

	public void setDirector(String Director) {
		this.director = director;
	}

	public void setOpenyear(String openyear) {
		this.openyear = openyear;
	}

	public String getTitle() {
		return this.title;
	}

	public String getBarcodenum() {
		return this.barcodenum;
	}

	public String getDirector() {
		return this.director;
	}

	public String getOpenyear() {
		return this.openyear;
	}
}
