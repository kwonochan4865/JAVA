package chapter10_exception;

public class Member_9 {
	public String id;
	
	public Member_9(String id) {
		this.id = id;
	}
	

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member_9) {
			Member_9 member = (Member_9) obj;
			if(id.contentEquals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
