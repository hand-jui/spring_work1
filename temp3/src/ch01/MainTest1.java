package ch01;

public class MainTest1 {

	public static void main(String[] args) {
//		옵저버 패턴을 배워보자
		Button button = new Button("button1");
//		인터페이스 기본 문법 --> 익명 클래스 --> 익명 구현 클래스
		button.setIButtonListener(new IButtonListener() {

			@Override
			public void clickEvent(String event) {
//				하고 싶은 동작, 알고리즘 구현
				System.out.println("콜백 들어옴~" + event);
			}
		});
		////////////////////콜백 메서드  = 옵저버 패턴 설계 완료
//		오후 4시 됨 --> 알람 울림
		button.click("집에 가라~ 엄마 기달린다");
		
		button.click("찐 콜백임? ");
		button.click("ㅇㅇ 옵저버 패턴이라던디");
	}

}
