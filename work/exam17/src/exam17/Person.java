package exam17;

public class Person {

	private int age;
	private String myName;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			System.out.println("잘못된 입력");
			return;
		}

		this.age = age;

	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

}
