package chapter13.framwork;

public class Student7 {
	public int sno;
	public String name;

	public Student7(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	public boolean equlas(Object obj) { // sno와 name을 obj변수에 넣음, 부모와 자식의 sno, name값이 같다면 true를 반환
		if (obj instanceof Student7) {
			Student7 student = (Student7) obj; // 부모 타입을 자식 타입으로 명시적 형변환
			return (sno == student.sno) && (name.equals(student.name));
		} else {
			return false;
		}
	}

	public int hashCode() { // 부모와 자식의 sno, name값이 같다면 동일한 값을 리턴함
		return sno + name.hashCode();
	}

}