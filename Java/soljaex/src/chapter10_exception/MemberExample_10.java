package chapter10_exception;

public class MemberExample_10 {

	public static void main(String[] args) {
		Member_9 obj1 = new Member_9("blue");
		Member_9 obj2 = new Member_9("blue");
		Member_9 obj3 = new Member_9("red");
		
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
