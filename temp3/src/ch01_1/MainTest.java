package ch01_1;

public class MainTest {

	public static void main(String[] args) {
		
		Button button = new Button("버튼이다");
		button.setIButtonListener(new IButtonListener() {
			
			@Override
			public void clickEvent(String event) {
				System.out.println("여긴 콜백이여");
			}
		});
		
		button.click("잠온다잉");
		button.click("잠와,,");
		
	}
}
