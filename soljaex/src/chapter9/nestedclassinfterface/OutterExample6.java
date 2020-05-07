package chapter9.nestedclassinfterface;

public class OutterExample6 {

	public static void main(String[] args) {
		Outter5 outter = new Outter5();
		Outter5.Nested nested = outter.new Nested();
		nested.print();
	}

}
