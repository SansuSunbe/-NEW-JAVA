package exam02;

public class ChangeCharExam02 {

	public static void main(String[] args) {
		
		char ch = 'E';
		int num = 97;
		
		int chToNum = 0;
		char intToch = ' '; // char형은 초기값으로 공백을 넣어야 할 때 띄어쓰기로 공백을 넣어줘야한다.
		
		// int형과 char형은 자동형변환이 된다.
		// char -> int로 변경할 때는 자동형변환이 가능
		chToNum = ch;
		// int -> char로 변경할 때는 강제형변환 해야한다.
		intToch = (char)num;
		
		System.out.println(chToNum);
		System.out.println(intToch);
	}
}
