package chapter11.apidocument;

public class Member9 {
	public String id;
	
	public Member9(String id) {
		this.id = id;
	}
	

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member9) {
			Member9 member = (Member9) obj;
			if(id.contentEquals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
