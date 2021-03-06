package chapter6.classexample;

public class CarExample20 {

	public static void main(String[] args) {
		Car19 myCar = new Car19();
		
		myCar.setGas(5); //Car19의 setGas() 메소드 호출 
		
		boolean gasState = myCar.isLeftGas(); //Car19의 isLeftGas() 메소드 호출 
		if(gasState) {  //Car19 클래스에 따라 gasState 값은 true이 리턴됨 
			System.out.println("출발합니다.");
			myCar.run(); //Car의 run() 메소드 호출 
		}
		
		if(myCar.isLeftGas()) { //Car의 isLeftGas() 메소드 호출 
			System.out.println("gas를 주입하세요.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
