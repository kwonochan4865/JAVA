package exex;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class Member { // �� Ŭ����
	private String id;
	private String name;
	private String phoneNum;
	private int rentalFee;
	private int point;
	private Grade grade;
	
	
	public Member(){
		this.setMember();
	}
	
	public void setMember(){
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("���ο� �ɹ��� �߰��մϴ�.");
			System.out.print("���� ���̵� �Է����ּ��� : ");
			this.id = in.readLine();
			System.out.print("���� �̸��� �Է����ּ��� : ");
			this.name = in.readLine();
			System.out.print("���� ��ȭ��ȣ�� �Է����ּ��� : ");
			this.phoneNum = in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.grade = BronzeGrade.getInstance();
		this.rentalFee = grade.calcRentalFee();
	}
	
	public void setPointUp(){
		this.point+=10;
		System.out.println(this.name+"���� ����Ʈ�� 10 �����߽��ϴ�.");
	}	

	
	public void calcRentalFee(){
		this.rentalFee = grade.calcRentalFee();
	}
	
	
	///////////////////////////////MemberŬ���� seter geter /////////////////////////////////////
	
	public void setId(String id){
		this.id = id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setPhoneNum(String phoneNum){
		this.phoneNum = phoneNum;
	}
	
	public void setPoint(int point){
		this.point = point;
	}
	
	public void setGrade(Grade grade){
		this.grade = grade;
	}
	
	public String getId(){
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getPhoneNum(){
		return this.phoneNum;
	}
	
	public int getPoint(){
		return this.point;		
	}
	
	public Grade getGrade(){
		return this.grade;
	}
	
	//////////////////////////////////////////////////////////////////////////////
}


abstract class Grade{// Grade �߻� Ŭ���� �������� �����Ͻ� ���� ���ٴ� ����
	public abstract int calcRentalFee();
	public abstract String getStrGrade();
}


class GoldGrade extends Grade{//GoldGrade Ŭ���� Grade ���
	private int rentalFee = 700;
	private String strGrade = "Gold";
	private static GoldGrade instance;
	
	private GoldGrade(){}
	
	public static GoldGrade getInstance(){
		if(instance == null) instance = new GoldGrade();
		return instance;
	}
	
	public String getStrGrade(){
		return this.strGrade;
	}
	
	public int calcRentalFee(){
		return this.rentalFee;
	}
}

class SilverGrade extends Grade{//SilverGrade Ŭ���� Grade ���
	private int rentalFee = 1000;
	private String strGrade = "Silver";
	private static SilverGrade instance;
	
	private SilverGrade(){}
	
	public static SilverGrade getInstance(){
		if(instance == null) instance = new SilverGrade();
		return instance;
	}
	
	public String getStrGrade(){
		return this.strGrade;
	}
	
	public int calcRentalFee(){
		return this.rentalFee;
	}
}

class BronzeGrade extends Grade{//BronzeGrade Ŭ���� Grade ���
	private int rentalFee = 1200;
	private String strGrade = "Bronze";
	private static BronzeGrade instance;
	
	private BronzeGrade(){}
	
	public static BronzeGrade getInstance(){
		if(instance == null) instance = new BronzeGrade();
		return instance;
	}
	
	public String getStrGrade(){
		return this.strGrade;
	}
	
	public int calcRentalFee(){
		return this.rentalFee;
	}
}

