package days24;

import days24.Button.OnClickListener;

/**
 * @author sangmun
 * @date 2023. 8. 16. - 오후 12:38:22
 * @subject	중첩 인터페이스
 * @content
 */
public class Ex05 {
	public static void main(String[] args) {
		Button btnTouch = new Button();
		btnTouch.setOnClickListenerOnClickListener(new CallListener());
		btnTouch.touch();
		btnTouch.setOnClickListenerOnClickListener(new MessageListener());
		btnTouch.touch();
	}
}

class Button {
	OnClickListener listener;
	
	void setOnClickListenerOnClickListener (OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		this.listener.onClick();
	}
	
	interface OnClickListener {
		void onClick();
	}
}

class CallListener implements OnClickListener {

	@Override
	public void onClick() {
		System.out.println("전화를 건다.");
	}
	
}

class MessageListener implements OnClickListener {

	@Override
	public void onClick() {
		System.out.println("메시지를 보낸다.");
	}
	
}