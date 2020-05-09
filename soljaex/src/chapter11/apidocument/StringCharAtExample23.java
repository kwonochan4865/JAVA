package chapter11.apidocument;

public class StringCharAtExample23 {

	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7); //배열 0~7번째의 글자를 sex라는 변수에 담음
		switch (sex) {
		case '1': //sex에 오는 글자가 "1" or "3"이면 남자입니다를 출력
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2': //sex에 오는 글자가 "1" or "3"이면 여자입니다를 출력
		case '4':
			System.out.println("여자입니다"); 
			break;
		}
	}
}
