package chapter11.apidocument;

public class StringToLowerUpperCaseExample30 {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";

		System.out.println(str1.contentEquals(str2));

		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.contentEquals(lowerStr2));

		System.out.println(str1.equalsIgnoreCase(str2));

	}
}
