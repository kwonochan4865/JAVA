package chapter6.classexample;

public class CarExample_45 {

	public static void main(String[] args) {
		Car_44 myCar = new Car_44();
		
		//잘못된 속도 변경
		myCar.setSpeed(-50);
		
		System.out.println("현재 속도: "+ myCar.getSpeed());
		
		//올바른 속도 변경 
		myCar.setSpeed(60);
		
		/**
		 * TODO 이해 못함 
		 */
		//멈춤 .
		if(!myCar.isStop()) {
			myCar.setStop(true);   
		}

		System.out.println("현재 속도: " + myCar.getSpeed());
	}
}
