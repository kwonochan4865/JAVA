package chapter8.interfaceex;

public class Television3 implements RemoteControl2 { //Television3가 RemoteControl2라는 추상 클래스의 실제 클래스로 구현하려면
	                                                          //RemoteControl2의 메서드들을 선언해야함
	//필드
	private int volume;                                                        
	
	//turnOn() 추상 메서드의 실제 메서드                                                    
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	//turnOff() 추상 메서드의 실제 메서드
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	public void setVolume(int volume) { //setVolume() 추상 메서드의 실제 메서드
		if(volume>RemoteControl2.MAXVOLUME) {
			this.volume = RemoteControl2.MAXVOLUME;  //인터페이스 상수를 이용하여 voulme필드의 값을 제한
		} else if(volume<RemoteControl2.MINVOLUME) {  
			this.volume = RemoteControl2.MINVOLUME;
		} else { 
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
}
