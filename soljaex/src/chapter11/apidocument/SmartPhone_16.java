package chapter11.apidocument;

public class SmartPhone_16 {
	private String company;
	private String os;
	
	public SmartPhone_16(String company, String os) {
		this.company = company;
		this.os = os;
	}
	@Override 
	public String toString() {
		return company + ", " + os;
	}
}
