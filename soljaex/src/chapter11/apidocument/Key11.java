package chapter11.apidocument;

public class Key_11 {
	public int number;
	
	public Key_11(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key_11) {
			Key_11 compareKey = (Key_11) obj;
			if(this.number == compareKey.number) { 
			return true;
			}
		}
		return false;
	}
	
}
