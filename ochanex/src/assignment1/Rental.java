package assignment1;

public class Rental {
	private Member member;
	private Video video;
	private int rentalPeriod;
	
	public Rental(Member member, Video video, Date dateRented ,int rentalPeriod){
		this.member = member;
		this.video = video;
		this.rentalPeriod = rentalPeriod;
	}	
	
	public void setMember(Member mem){
		this.member = mem;
	}
	public void setVideo(Video vdo){
		this.video = vdo;
	}
	public void setRentalPeriod(int rentalPeriod){
		this.rentalPeriod = rentalPeriod;
	}
	public Member getMember(){
		return this.member;
	}
	public Video getVideo(){
		return this.video;
	}
	public int getRentalPeriod(){
		return this.rentalPeriod;
	}
}
