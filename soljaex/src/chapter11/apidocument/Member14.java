package chapter11.apidocument;

public class Member14 {
	public String id;
	
	public Member14(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member14) {
			Member14 member = (Member14) obj;
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
