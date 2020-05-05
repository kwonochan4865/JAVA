package chapter7.inheritance;

public class ComputerExample_10 {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator_7 calculator = new Calculator_7();
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println();
		
		Computer_8 computer = new Computer_8();
		System.out.println("원면적 : " + computer.areaCircle(r));
	}
}
