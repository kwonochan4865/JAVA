package chapter9_nestedclassinfterface;

public class MessageListener_9 implements Button_7.OnClickListener {
	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
	}
}
