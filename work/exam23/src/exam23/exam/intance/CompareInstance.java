package exam23.exam.intance;

import exam23.exam.manytype.Computer;
import exam23.exam.manytype.Sonic;
import exam23.exam.manytype.Windows;

public class CompareInstance {

	public static void getMyType(Computer com) {

		if (com instanceof Windows) {
			System.out.println("윈도우");
		} else if (com instanceof Sonic) {
			System.out.println("소닉");
		} else {
			System.out.println("NonOs");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer window = new Windows();
		Computer sonic = new Sonic();

		CompareInstance.getMyType(window);
		CompareInstance.getMyType(sonic);

	}

}
