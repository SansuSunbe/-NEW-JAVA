package exam18;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st01 = new Student();
		Student st02 = new Student(17, "김자바", "자바고등학교"); // 데이터를 바로 주입했기에 set을 안해도 출력 가능
		
		st01.setAge(18);
		st01.setMyName("이자바");
		st01.setSchool("자바하이스쿨");
		
		System.out.println("이름 : " + st01.getMyName() + "나이 : " + st01.getAge() + "학교 : " + st01.getSchool());
		System.out.println("이름 : " + st02.getMyName() + "나이 : " + st02.getAge() + "학교 : " + st02.getSchool());
	}

}
