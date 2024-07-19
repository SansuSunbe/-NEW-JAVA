package exam17;

public class Bank {

	private int money;

	// 입금
	public void setMoney(int money) {
		if (money < 0) {
			System.out.println("잘못된 값 입력됨");
			return; // 일찍 종료

		}

		this.money = money;

	}
	
	// 잔액 출력
	public int getMoney() {
		return money;
	}
}
