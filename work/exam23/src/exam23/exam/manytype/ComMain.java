package exam23.exam.manytype;

public class ComMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ComputerRoom computerRoom = new ComputerRoom();

		computerRoom.setCom1(new Sonic());
		computerRoom.setCom2(new Windows());

		computerRoom.allPowerOn();
		computerRoom.allPowerOff();

	}

}
