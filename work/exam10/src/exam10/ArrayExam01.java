package exam10;

public class ArrayExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 정수형 5개의 공간을 가지는 배열 선언
		int [] intArray = new int[5];
		
		// 문자열 5개를 공간을 가지는 배열 선언
		String[] strArray = new String[5];
		
		// 값과 공간을 가지는 배열
		int[] varArray = {1, 2, 3, 4, 5};
		
		// 배열자체를 출력하기
		System.out.println(intArray); // 메모리 주소 출력
		
		// 배열의 첫번째 값 출력
		System.out.println(intArray[0]);
		System.out.println(intArray[2]);
		
		System.out.println(varArray[2]);
		
		intArray[0] = 10;
		intArray[1] = 12;
		intArray[2] = 23;
		
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);

	}

}
