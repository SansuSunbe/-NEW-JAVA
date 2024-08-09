package exam23.exam.type;

public class Bus extends Car{
	
	public Bus(String myName) {
		super(myName);
	}
	
	public void getInfo() {
		System.out.println("버스 이름 : " + this.getMyName());
	}

}
