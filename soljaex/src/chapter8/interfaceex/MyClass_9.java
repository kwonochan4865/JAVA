package chapter8.interfaceex;

public class MyClass_9 {
	//필드
	RemoteControl_2 rc = new Television_3();


	//생성자
	MyClass_9() {
	}


	MyClass_9(RemoteControl_2 rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//메서드
	void methodA() {
		RemoteControl_2 rc = new Audio_4();
		rc.turnOn();
		rc.setVolume(5);
	}
	void methodB(RemoteControl_2 rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
