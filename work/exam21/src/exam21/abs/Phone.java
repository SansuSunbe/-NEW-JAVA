package exam21.abs;

public abstract class Phone {

	// 추상화 메서드
	public abstract void openingLogo();
	public abstract void endingLogo();

	public void powerOn() {
		this.openingLogo(); // 자식 클래스가 정의한 메서드 내용이 출력
		System.out.println(" On");
	}

	public void powerOff() {
		this.endingLogo();
		System.out.println(" Off");
	}

}
