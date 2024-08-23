package exam24.member.cls;

public class CalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal = new Calculator(12, 20);
		// 내부클래스 선언
		Calculator.Calc calc = cal.new Calc();
		
		// 내부클래스 메서드 실행
		System.out.println("더하기 값 : " + calc.add());

	}

}
