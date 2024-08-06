package exam20.upper;

public class Book2 {

	String title;
	int price;
	
	public Book2(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public void info() {
		System.out.println("제목 : " + this.title);
		System.out.println("가격 : " + this.price);
	}

}
