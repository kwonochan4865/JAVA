package chapter9.nestedclassinfterface;

public class Window15 {
	Button14 button1 = new Button14();
	Button14 button2 = new Button14();
	
	//필드 초기값으로 대입
	Button14.OnClickListener listener = new Button14.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("전화를 켭니다.");
		}
	};
	

	Window15() {
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button14.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}
		});
	}
}
