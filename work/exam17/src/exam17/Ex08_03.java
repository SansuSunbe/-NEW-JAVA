package exam17;

public class Ex08_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int money = 34000;
		int count = 0;
		while (true) {
			if (money < 1500) {
				System.out.println("대중교통을 " + count + "번 만큼 이용");
				System.out.println("남은 금액 : " + money + "원");
				System.out.println("교통카드 충전 필요");
				return;
			}

			money -= 1500;
			count++;

		}

	}

}
