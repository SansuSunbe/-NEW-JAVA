package exam03;

public class UpDownExam {

	public static void main(String[] args) {

		int num = 10;
		int sum = 0;

		sum = num++; // 연산 후 증가

		System.out.println("sum = " + sum + ", num : " + num);

		sum = ++num; // 증가 후 연산

		System.out.println("sum = " + sum + ", num : " + num);

	}

}
