package chapter7.inheritance;

public class ComputerExample10 {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator7 calculator = new Calculator7();
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println();
		
		Computer8 computer = new Computer8();
		System.out.println("원면적 : " + computer.areaCircle(r));
	}
}
