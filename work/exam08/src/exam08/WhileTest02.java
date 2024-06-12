package exam08;

import java.util.Scanner;

public class WhileTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int target = (int) (Math.random() * 50) + 1;
		Scanner scan = new Scanner(System.in);

		int user = 0;
		int count = 1;

		while (target != user) {

			System.out.println("숫자 입력 : ");
			user = scan.nextInt(); // 정수 값 입력

			if (target > user) {
				System.out.println("Up");
			} else if (target < user) {
				System.out.println("Down");
			} else {
				System.out.println("정답 : " + target + " 입니다.");
				System.out.println("시도 횟수 : " + count);
			}

			count++;

		}

		scan.close();

	}

}
