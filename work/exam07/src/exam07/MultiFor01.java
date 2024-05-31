package exam07;

public class MultiFor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int gugu = 2; gugu < 10; gugu++) {
			for (int dan = 1; dan <= 9; dan++) {
				System.out.print(gugu + " X " + dan + " = " + (gugu * dan) + "\t");
			}
			
			// 줄바꿈 용도
			System.out.println();
			
		}

	}

}
