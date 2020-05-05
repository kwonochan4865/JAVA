package chapter7_inheritance;

public class Student_5 extends People_4 {
	public int studentNo;
	
	public Student_5(String name, String ssn, int studentNo) {
		super(name, ssn); //이 부분을 주석 처리하면 "Implicti super constructor People_4() is undefined. Must explicity invok another constructor"라고 오류 뜸 
		this.studentNo = studentNo;
	}
}
