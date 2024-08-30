package exam26.exam.excp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowableExam {

	public static void checkYourSelf(Scanner scan) throws InputMismatchException {

		System.out.println("1. 외향적 / 2. 내향적");
		System.out.print("선택 : ");

		int check = scan.nextInt();

		if (check == 1) {
			System.out.println("MBTI : E");
		} else if (check == 2){
			System.out.println("MBTI : I");
		} else {
			System.out.println("1 과 2 중에 선택");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		try {
			
			System.out.println("성격 유형 검사");
			ThrowableExam.checkYourSelf(scan);
			
		} catch (InputMismatchException e) {
			System.out.println("키보드 입력이 잘못됨");
		} finally {
			if (scan != null) {
				scan.close();
			}
		}

	}

}
