package assignment1;

import java.io.IOException;
import java.io.InputStreamReader;

public class Video {
	private EnrolledVideoinfo enrolledvideoinfo;
	private String title;
	private int serialnum;
	private int order;
	private boolean isRental;

	private InputStreamReader in = new InputStreamReader(System.in);

	public Video(EnrolledVideoinfo enrolledvideoinfo) {
		this.enrolledvideoinfo = enrolledvideoinfo;

		try {
			System.out.print("비디오 코드를 입력해주세요");
			serialnum = in.read();
		} catch (IOException e) {
			System.err.print("비디오 생성중 오류");
			e.printStackTrace();
		}

	}

	public void setEnrolledVdoData(String enrolledVdoData) {
		this.enrolledvideoinfo = enrolledvideoinfo;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setSerialnum(int serialnum) {
		this.serialnum = serialnum;
	}

	public void setOrder(int order) {
		this.order = order;
	}
}
