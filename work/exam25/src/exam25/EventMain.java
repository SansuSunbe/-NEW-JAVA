package exam25;

public class EventMain {

	// 버튼 클래스
	public class Button {
		private ButtonClickListener listener;

		// setter
		public void setListener(ButtonClickListener listener) {
			this.listener = listener;
		}
		
		public void click() {
			if(this.listener != null) {
				this.listener.click();
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EventMain main = new EventMain();
		// 내부클래스 선언
		EventMain.Button button = main.new Button();
		
		ButtonClickListener listener = new ButtonClickListener() {
			
			@Override
			public void click() {
				// TODO Auto-generated method stub
				System.out.println("Button Click");
			}
		};
		
		button.setListener(listener);
		button.click();

	}

}
