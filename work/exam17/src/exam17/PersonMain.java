package exam17;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p01 = new Person();
		
		p01.setMyName("홍길동");
		p01.setAge(30);
		
		System.out.println("이름 : " + p01.getMyName());
		System.out.println("나이 : " + p01.getAge());

	}

}
