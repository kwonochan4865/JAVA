package chapter7.inheritance;

public class Student5 extends People4 {
	public int studentNo;
	
	public Student5(String name, String ssn, int studentNo) {
		super(name, ssn); //이 부분을 주석 처리하면 "Implicti super constructor People4() is undefined. Must explicity invok another constructor"라고 오류 뜸 
		this.studentNo = studentNo;
	}
}
