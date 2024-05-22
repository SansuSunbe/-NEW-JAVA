package exam03;

public class OperatorExam01 {
		
	public static void main(String[] args) {
		
		int intNum01 = 100;
		byte byteNum01 = 10;
		long longNum01 = 20;
		double doubleNum01 = 33.3333;
		
		// byte 끼리 덧셈을 하면 결과는 int로 변환해야한다.
		// 서로 다른 데이터타입끼리 더할 땐 결과는 더 큰 데이터타입으로 출력되어야 한다.
		// int + int 끼리 더 할 때 결과값이 int가 표현할 수 있는 크기를 넘을 수 있기 때문
		// byte byteResult = byNum01 + byteNume01;
		
		int intResult01 = byteNum01 + byteNum01;
		
		long longResult01 = longNum01 + intNum01;
		
		intResult01 = byteNum01 + intNum01;
		
		int target = 10;
		
		// ctrl + spacebar = 명령어 단축키
		System.out.println(target % 3);
		
	}

}
