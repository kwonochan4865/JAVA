import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Video {
	private String code;
	private VideoTitle vdoTt;
	private boolean isRantal;
	private Member borrower;
	
	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
	public Video(VideoTitle vdoTt){
		this.vdoTt = vdoTt;		
		
		try {
		System.out.print("input the Video code");
			code = in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.print("error the generating video");
			e.printStackTrace();
		}		
		this.isRantal = false;
		this.borrower = null;
	}
		
	public void setCode(String code){
		this.code = code;
	}
	
	public void rented(Member mem){
		borrower = mem;
		isRantal = true;
	}
	
	public void returned(){
		borrower = null;
		isRantal = false;
	}
	
	
	public String getCode(){
		return this.code;
	}
	
	public VideoTitle getVideoTitle(){
		return this.vdoTt;
	}
	
	public boolean getIsRental(){
		return this.isRantal;
	}
	
	public Member getBorrower(){
		return borrower;
	}
}
