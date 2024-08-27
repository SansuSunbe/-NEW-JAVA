package exam25;

public class Exam01Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 일반적인 객체화
		Person p = new Person();
		p.introduce();

		// 익명클래스
		Person p2 = new Person() {
			@Override
			public void introduce() {
				System.out.println("인간");
			}
		};
		
		p2.introduce();

	}

}
