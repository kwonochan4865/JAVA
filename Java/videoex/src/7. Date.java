import java.util.Scanner;

public class Date {//��¥ Ŭ����
	private int year;
	private int month;
	private int day;
	private Scanner sc = new Scanner(System.in);
	
	public Date(){
		System.out.print("���� �⵵�� �Է��ϼ��� : ");
		year = sc.nextInt();
		System.out.print("���� ���� �Է��ϼ��� : ");
		month = sc.nextInt();
		System.out.print("���� ��¥�� �Է��ϼ��� : ");
		day = sc.nextInt();		
	}
	
	public Date(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public int getMonth(){
		return this.month;
	}
	
	public int getDay(){
		return this.day;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public void setMonth(int month){
		this.month = month;
	}
	
	public void setDay(int day){
		this.day = day;
	}
}
