package chapter9.nestedclassinfterface;

public class MessageListener9 implements Button7.OnClickListener {
	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
	}
}
