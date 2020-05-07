package chapter9.nestedclassinfterface;

public class Window_15 {
	Button_14 button1 = new Button_14();
	Button_14 button2 = new Button_14();
	
	//필드 초기값으로 대입
	Button_14.OnClickListener listener = new Button_14.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("전화를 켭니다.");
		}
	};
	

	Window_15() {
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button_14.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}
		});
	}
}
