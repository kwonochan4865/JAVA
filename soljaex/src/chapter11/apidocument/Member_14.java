package chapter11.apidocument;

public class Member_14 {
	public String id;
	
	public Member_14(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member_14) {
			Member_14 member = (Member_14) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
