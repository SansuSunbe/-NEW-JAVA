package exam01;

public class HelloJava {

	public static void main(String[] args) {
		
		// 주석
		/*
		 * 여러줄로
		 * 주석을 쓸 수 있다.
		 * */
		
		// 정수형 타입 선언
		int num01 = 10;
		byte byNum = 20;
		
		// 실수 
		double doubleNum = 30.3111;
		float flNum = 33.12f;
		
		// 문자
		char ch = 'A';
		
		// 문자형
		String str = "날씨";
		
		// 논리형
		boolean b = false;
		
		// 문장이 끝나고 줄이 바뀌는 명령어
		// ctrl + spacebar = 키워드 자동 생성 단축키 
		System.out.println(num01);
		System.out.println(byNum);
		// 줄바꿈하지 않고 출력하는 명령어
		// + "\n" = 줄바꿈 명령어
		// ctrl + F11 = 프로그램 실행 기본 단축키 
		System.out.print(doubleNum);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(b);

	}

}
