package exam07;

public class TrinagleExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 공백이 있는 직각삼각형 만들기
		for (int i = 0; i < 7; i++) {
			// 공백
			for (int j = 0; j < 7 - i; j++) {
				System.out.print(" ");
			}
			
			// 별 증가
			for(int star = 0; star < (i + 1); star++) {
				System.out.print("*");
			}
			
			// 줄바꿈
			System.out.println();
			
		}

	}

}
