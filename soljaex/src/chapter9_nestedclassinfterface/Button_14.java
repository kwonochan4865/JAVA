package chapter9_nestedclassinfterface;

public class Button_14 {
	OnClickListener listener;
	
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
