package assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Member {
	private String name;
	private String phoneNum;
	private int point;

	public Member() {
		this.setMember();
	}

	public void setMember() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("새로운 회원 추가");
			System.out.print("추가할 회원의 이름을 입력해주세요: ");
			this.name = in.readLine();

			System.out.print("고객의 전화번호를 입력해주세요: ");
			this.phoneNum = in.readLine();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void setPointUp() {
		this.point += 10;
		System.out.println(this.name + "님의 포인트가 10 증가했습니다.");
	}

	///////////////////////////////////////////////////////Getter and Setter
	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getName() {
		return this.name;
	}

	public String PhoneNum() {
		return this.phoneNum;
	}

	public int getPoint() {
		return this.point;
	}
}