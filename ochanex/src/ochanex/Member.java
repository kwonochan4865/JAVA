package ochanex;

public class Member {

	private String name;
	private String phonNum;
	private int rentalFee;
	private int point;
	private Grade grade;
}

abstract class Grade {
	public abstract int calcRentalFee();
	public abstract String getStrGrade();
}