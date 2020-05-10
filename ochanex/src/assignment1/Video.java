package assignment1;

import java.io.IOException;
import java.io.InputStreamReader;

public class Video {
	private SerialNumber enrolledvideoinfo;
	private String title;
	private int serialnum;
	private int order;
	private boolean isRental;

	private InputStreamReader in = new InputStreamReader(System.in);
// System.in 입력값을 in을 리모콘으로 하는 InputStreamReader 객체 생성

	public Video(SerialNumber enrolledvideoinfo) { // enrolledvideoinfo를 변수로
		this.enrolledvideoinfo = enrolledvideoinfo;
		try {
			System.out.print("비디오 제목을 입력해주세요");
			serialnum = in.read(); // serialnum에 (in을 통해)읽은 값 넣음
		} catch (IOException e) { // 입력 값이 없는 경우(사실 읽은 값) 에러 문구 호출 후
			System.err.print("비디오 생성중 오류");
			e.printStackTrace();// 에러 메세지 발생 근원지를 찾아 단계별로 에러 출력
		}
		this.isRental = false;

	}

//	public void setEnrolledVdoData(String enrolledVdoData) {
//		this.enrolledvideoinfo = enrolledvideoinfo;
//	}
////////////////////////////////////////////////Getter and Setter
	public void setTitle(String title) {
		this.title = title;
	}

	public void setSerialnum(int serialnum) {
		this.serialnum = serialnum;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public SerialNumber getEnrolledvideoinfo() {
		return enrolledvideoinfo;
	}

	public int getSerialnum() {
		return serialnum;
	}

	public int getOrder() {
		return order;
	}
}
