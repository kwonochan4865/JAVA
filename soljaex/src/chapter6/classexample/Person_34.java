package chapter6.classexample;

public class Person_34 {
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person_34(String ssn, String name) {
		this.ssn = ssn; // final은 변하면 안되므로 값이 정해져 있어야 함 하지만 final필드는 객체마다 생성되므로 공용성을 띠지 않음. static + final이 상수를 의미  
		this.name = name;
	}
}
