package chapter13.framwork;

public class Member6 {
	public String name;
	public int age;
	
	public Member6(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member6) {
			Member6 member = (Member6) obj;
			return member.name.equals(name) && (member.age==age);
		} else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}
