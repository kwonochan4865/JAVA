package chapter8.interfaceex;

public class Audio4 implements RemoteControl2 {
	//필드
	private int volume;
	
	//turnOn() 추상 메서드의 실체 메서드
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	//turnOff() 추상 메서드의 실체 메서드
	public void turnOff() { 
		System.out.println("Audio를 끕니다.");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl2.MAXVOLUME) {
			this.volume = RemoteControl2.MAXVOLUME;
		} else {
			this.volume = volume;
	}
	System.out.println("현재 Audio 볼륨: " + this.volume);
}
}
