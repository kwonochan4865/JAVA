package chapter8.interfaceex;

public class SmartTelevision7 implements RemoteControl2, Searchable6 {
	private int volume;
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl2.MAXVOLUME) {
			this.volume = RemoteControl2.MAXVOLUME;
		} else if(volume<RemoteControl2.MINVOLUME) {
			this.volume = RemoteControl2.MINVOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
}

