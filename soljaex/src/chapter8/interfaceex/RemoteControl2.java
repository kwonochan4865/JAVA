package chapter8.interfaceex;

public interface RemoteControl2 {
	//상수
	public int MAXVOLUME =  10;
	public int MINVOLUME = 0;
	
	//추상 메서드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
