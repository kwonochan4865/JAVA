package assignment1;

import java.io.IOException;
import java.io.InputStreamReader;

public class EnrolledVideoinfo {
	private int title;
	private int barcodenum;
	private int director;
	private int openyear;

	public EnrolledVideoinfo() {
		this.setEnrolledVideoinfo();
	}

	public void setEnrolledVideoinfo() {
		InputStreamReader is = new InputStreamReader(System.in);
		try {
			System.out.print("비디오 제목을 입력해주세요: ");
			title = is.read();
			System.out.print("비디오 바코드 번호를 입력해주세요: ");
			barcodenum = is.read();
			System.out.print("비디오 감독을 입력해주세요: ");
			director = is.read();
			System.out.print("비디오 개봉 년도를 입력해주세요: ");
			openyear = is.read();
		} catch (IOException e) {
			System.err.print("비디오 등록 오류");
			e.printStackTrace();
		}
	}

	public void setTitle(int title) {
		this.title = title;
	}

	public void setBarcodenum(int barcodenum) {
		this.barcodenum = barcodenum;
	}

	public void setDirector(int Director) {
		this.director = director;
	}

	public void setOpenyear(int openyear) {
		this.openyear = openyear;
	}
}
