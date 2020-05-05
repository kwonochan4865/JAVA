package chapter9_nestedclassinfterface;

public class Button_7 {
	OnClickListener listener; // 인터페이스 타입 필드
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener {
		void onClick();
	}
}
