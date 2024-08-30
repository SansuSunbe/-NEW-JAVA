package exam26.exam.excp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		try {
			
			int [] cards = {4, 2, 5, 6, 7, 1, 3};
			
			System.out.print("카드 선택 : ");
			
			int cardIndex = scan.nextInt();
			
			System.out.println("뽑은 카드 번호 : " + cards[cardIndex]);
			
		} catch (InputMismatchException e) {
			System.out.println("키 입력이 잘못됨");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("선택된 배열 위치가 잘못됨");
		} finally {
			// 예외 발생 유무와 상관 없이 무조건 실행
			System.out.println("예외 끝");
			scan.close();
		}

	}

}
