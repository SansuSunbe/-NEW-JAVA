package exam22.inter2;

public class BlutoothMic implements MicroPhone, Speaker{

	@Override
	public void music() {
		System.out.println("Mic is Play The Music");
		
	}

	@Override
	public void sing() {
		System.out.println("Singing with Mic");
		
	}

}
