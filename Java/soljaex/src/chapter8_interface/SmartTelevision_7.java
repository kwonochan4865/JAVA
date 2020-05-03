package chapter8_interface;

public class SmartTelevision_7 implements RemoteControl_2, Searchable_6 {
	private int volume;
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl_2.MAX_VOLUME) {
			this.volume = RemoteControl_2.MAX_VOLUME;
		} else if(volume<RemoteControl_2.MIN_VOLUME) {
			this.volume = RemoteControl_2.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
}

