package chapter11.apidocument;

public class MemberExample10 {

	public static void main(String[] args) {
		Member9 obj1 = new Member9("blue");
		Member9 obj2 = new Member9("blue");
		Member9 obj3 = new Member9("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj과 obj는 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj과 obj은 동등합니다.");
		} else {
			System.out.println("obj1 obj3은 동등하지 않습니다.");
		}
	}
}
