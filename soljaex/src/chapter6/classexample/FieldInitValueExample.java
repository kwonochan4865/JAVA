package chapter6.classexample;

public class FieldInitValueExample {

	public static void main(String[] args) {
		FieldInitValue fiv = new FieldInitValue(); // FieldInitValue클래스로 인스턴스 생성 , FieldInitValue 안에 있는 필드를 이용
		
		System.out.println("byteField: " + fiv.byteField);
		System.out.println("shorField: " + fiv.shortField);
		System.out.println("intField: " + fiv.intField);
		System.out.println("longField: " + fiv.longField);
		System.out.println("booleanField: " + fiv.booleanField);
		System.out.println("charField: " + fiv.charField);
		System.out.println("floatField: " + fiv.floatField);
		System.out.println("doubleField: " + fiv.doubleField);
		System.out.println("referenceField: " + fiv.referenceField);
	}
}
