package chapter9.nestedclassinfterface;

public class OutterExample_6 {

	public static void main(String[] args) {
		Outter_5 outter = new Outter_5();
		Outter_5.Nested nested = outter.new Nested();
		nested.print();
	}

}
