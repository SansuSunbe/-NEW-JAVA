package exam13;

public class DoubleArrayExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2차원 배열 선언
		int[][] arr01 = new int[3][5];

		// 선언2
		int[][] arr02 = new int[3][];

		// 선언3 (2행 3열 크기 선언)
		int[][] arr03 = { { 1, 2, 3, }, { 4, 5, 6 } };

		// 출력
		System.out.println("2차원 배열 : " + arr01);
		System.out.println("2차원 배열 arr01 의 1차수 출력 : " + arr01[1]);
		System.out.println("2차원 배열 arr01 의 2차수 출력 : " + arr01[2]);
		System.out.println("2차원 배열 arr03 의 2행 2차수 출력 : " + arr03[1][2]);

		// 열을 쓰지 않고 선언했다면 추가해주어야 한다.
		for (int i = 0; i < arr02.length; i++) {
			arr02[i] = new int [3];
		}

	}

}
