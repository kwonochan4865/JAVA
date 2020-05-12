package garbage;

import java.util.ArrayList;

public class Example {
	public static void main(String[] arg) {
	
		ArrayList foods = new ArrayList<>();

		foods.add("피자");
		foods.add("치킨");
		foods.add("맥도날드");
		foods.add("불고기");
		foods.add("샐러드");
	System.out.println(String.join(", ", foods));

	}
}
