package chapter8.interfaceex;

public class MyClass9 {
	//필드
	RemoteControl2 rc = new Television3();


	//생성자
	MyClass9() {
	}


	MyClass9(RemoteControl2 rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//메서드
	void methodA() {
		RemoteControl2 rc = new Audio4();
		rc.turnOn();
		rc.setVolume(5);
	}
	void methodB(RemoteControl2 rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
