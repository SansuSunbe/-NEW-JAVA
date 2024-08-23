package exam24.st.cls;

public class PrintOut {

	// 정적클래스 선언
	public static class Out {
		public void println(String str) {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {

		PrintOut.Out out = new PrintOut.Out();
		String str = "정적내부클래스";

		out.println(str);

	}

}
