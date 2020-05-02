package chapter7_inheritance;

public class CarExample_25 {

	public static void main(String[] args) {
		Car_21 car = new Car_21();
		
		for(int i=0; i<=5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
				case 1:
					System.out.println("앞 왼쪽 HankookTire로 교체"); car.frontLeftTire = new HankookTire_22("앞 왼쪽", 15); // Car_21의 frontLeftTire필드 사용 
					// HankookTire_22에 Car_21의 frontLeftTire 생성자 생성 
				case 2:
					System.out.println("앞 오른쪽 KumhoTire로 교체");
					car.frontRightTire = new KumhoTire_23("앞 오른쪽", 13); // Car_21 이하 동문 다형성 
				   // KumhoTire_23에 Car_21의 frontRighTire 생성자 생성 (Car객체의 Tire_20필드에 KumhoTire 객체 대입 )
					System.out.println("뒤 왼쪽 HankookTire로 교체");
					car.backLeftTire = new HankookTire_22("뒤 왼쪽", 14); //Car_21
	              // HankookTire_22에 Car_21의 backLeftTire 생성자 생성 (Car객체의 Tire필드에 HankookTire 객체 대입)
				case 4: **** 이해 못함 
					System.out.println("뒤 오른쪽 KumhoTire로 교체");
					car.backRightTire = new KumhoTire_23("뒤 오른쪽", 17);
			}
			System.out.println("--------------------------------");
		}
	}

}
