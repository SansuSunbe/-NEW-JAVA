package exam23.exam.manytype;

public class Sonic implements Computer{

	@Override
	public void powerOn() {
		System.out.println("Welcome Sonic");
		System.out.println("Sonic On");
	}

	@Override
	public void powerOff() {
		System.out.println("GoodBye Sonic");
		System.out.println("Sonic Off");
	}

}
