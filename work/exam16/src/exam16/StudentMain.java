package exam16;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st01 = new Student();
		Student st02 = new Student();

		st01.myName = "홍길동";
		st02.myName = "고길동";

		st01.schoolInfo();
		
		// static이 붙은 변수는 생성한 객체명이 아닌 클래스이름으로 직접 호출을 권장한다.
		// 객체는 메모리의 주소를 참조하기 때문에 메모리 직접 호출하지 않는것은 메모리 낭비이기 때문
		System.out.println("나의 학교는 " + Student.school);
		st02.schoolInfo();
		
	}

}
