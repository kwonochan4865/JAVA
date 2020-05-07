package chapter11.apidocument;

public class SmartPhoneExample17 {

	public static void main(String[] args) {
		SmartPhone16 myPhone = new SmartPhone16("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone);
	}
}
