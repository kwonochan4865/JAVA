package chapter9.nestedclassinfterface;

public class ButtonExample10 {
	public static void main(String[] args) {
		Button7 btn = new Button7();
		
		btn.setOnClickListener(new CallListener8());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener9());
		btn.touch();
	}
}
