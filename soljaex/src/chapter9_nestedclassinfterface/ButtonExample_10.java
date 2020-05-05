package chapter9_nestedclassinfterface;

public class ButtonExample_10 {
	public static void main(String[] args) {
		Button_7 btn = new Button_7();
		
		btn.setOnClickListener(new CallListener_8());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener_9());
		btn.touch();
	}
}
