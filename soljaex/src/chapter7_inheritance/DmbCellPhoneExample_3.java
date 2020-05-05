package chapter7_inheritance;

public class DmbCellPhoneExample_3 {

	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		DmbCellPhone_2 dmbCellPhone = new DmbCellPhone_2("자바폰","검정", 10);
		
		//CellPhone 클래스로부터 상속받은 필드
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);

		//DmbCellPhone 클래스의 필드
		System.out.println("채널: " + dmbCellPhone.channel);
		
		//CellPhone 클래스로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요.");
		dmbCellPhone.receiveVoice("메시지 남깁니다.");
		dmbCellPhone.sendVoice("아! 예 예 누구셔요.");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone 클래스의 메소드 호출
		dmbCellPhone.turnOnDmb();
		
	}

}
