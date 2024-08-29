package exam26.exam.excp;

public class TryCatchExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			int num = 15;
			int result = 15 / 0;

			System.out.println("결괴 :" + result);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
			e.printStackTrace(); // 내부에서 에러난 내용 전체 출력
			System.out.println(e.getMessage()); // 에러 메시지만 출력
		}
		System.out.println("종료");

	}

}
