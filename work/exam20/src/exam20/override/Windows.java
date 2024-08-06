package exam20.override;

public class Windows extends Computer{
	
	@Override // <- Annotation(어노테이션) : 메서드의 역할, 상태, 기능을 부여함(메서드에만 국한되지 않음)
	public void powerOn() {
		super.powerOn();
		System.out.println("Windows On");
		System.out.println("Windows Start");
	}
	
	public void powerOff() {
		super.powerOff();
		System.out.println("Windows Off");
		System.out.println("Windows Down");
	}

}
