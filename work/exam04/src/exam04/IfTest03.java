package exam04;

import java.util.Scanner;

public class IfTest03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("점수 입력 : ");
		int score = scan.nextInt();

		if (score >= 90) {
			System.out.println("점수 : " + score + ", 학점 : A");
		} else if (score >= 80) {
			System.out.println("점수 : " + score + ", 학점 : B");
		} else if (score >= 70) {
			System.out.println("점수 : " + score + ", 학점 : C");
		} else {
			System.out.println("점수 : " + score + ", 학점 : F");
		}
		
		scan.close();

	}

}
