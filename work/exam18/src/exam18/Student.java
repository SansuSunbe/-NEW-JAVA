package exam18;

public class Student {
	
	private int age;
	private String myName;
	private String school;
	
	// 기본생성자
	public Student() {
		
	}
	
	// 생성자를 통해서 데이터를 받고싶을 때
	public Student(int age, String myName) {
		this.myName = myName;
		this.age = age;
	}
	
	// 오버로딩
	public Student(int age, String myName, String school) {
		this(age, myName);
		this.school = school;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

}
