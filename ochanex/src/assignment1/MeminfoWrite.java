package assignment1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MeminfoWrite {

	private String name;
	private String phoneNum;
	private int point;
	
	public MeminfoWrite() throws IOException {
		Member mb = new Member();
		
		name = mb.getName();
		phoneNum = mb.getPhoneNum();
		point = mb.getPoint();
		
		Writer info = new FileWriter("./회원정보", true);
	  	info.write(name + "∞");
	  	info.write(phoneNum + "∞");
	  	info.write(point + "∞");
	  	info.flush();
	  	info.close();
	}

	public String getName() {
		return name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public int getPoint() {
		return point;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public void setPoint(int point) {
		this.point = point;
	}
}
