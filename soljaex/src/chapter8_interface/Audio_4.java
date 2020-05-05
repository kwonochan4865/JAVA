package chapter8_interface;

public class Audio_4 implements RemoteControl_2 {
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
		if(volume>RemoteControl_2.MAX_VOLUME) {
			this.volume = RemoteControl_2.MAX_VOLUME;
		} else {
			this.volume = volume;
	}
	System.out.println("현재 Audio 볼륨: " + this.volume);
}
}
