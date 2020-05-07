package chapter9.nestedclassinfterface;

public class CallListener8 implements Button7.OnClickListener{
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
}
