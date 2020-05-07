package chapter11.apidocument;

public class Key11 {
	public int number;
	
	public Key11(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key11) {
			Key11 compareKey = (Key11) obj;
			if(this.number == compareKey.number) { 
			return true;
			}
		}
		return false;
	}
	
}
