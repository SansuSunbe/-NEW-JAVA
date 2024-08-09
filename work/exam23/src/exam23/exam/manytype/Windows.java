package exam23.exam.manytype;

public class Windows implements Computer {

	@Override
	public void powerOn() {
		System.out.println("Windows Start");
		System.out.println("Windows On");
	}

	@Override
	public void powerOff() {
		System.out.println("Windows Down");
		System.out.println("Windows Off");
	}

}
