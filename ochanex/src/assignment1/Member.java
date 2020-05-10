package assignment1;

import java.io.InputStreamReader;

public class Member {
	private String name;
	private String phoneNum;
	private int point;

	public Member() {
		this.setMember();
	}
	public void setMember() {
		InputStreamReader in = new InputStreamReader();
		try {
			System.out.println("새로운 회원 추가");
			System.out.print("추가할 회원의 이름을 입력해주세요: ");
			this.name = in.read();

		}
	}
}