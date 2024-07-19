package exam17;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b = new Bank();
		
		b.setMoney(-500);
		b.setMoney(10000);
		
		System.out.println("잔액 : " + b.getMoney());

	}

}
