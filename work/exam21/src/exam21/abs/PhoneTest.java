package exam21.abs;

public class PhoneTest {

	public static void main(String[] args) {

		Android android = new Android();
		Ios ios = new Ios();
		android.powerOn();
		android.powerOff();
		ios.powerOn();
		ios.powerOff();
	}
}
