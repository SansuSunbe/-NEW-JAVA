package exam12;

import java.util.Arrays;

public class ArraysExamToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열선언
		int [] arr1 = {5, 7, 1, 4, 11, 9, 10, 2, 4, 3};
		
		// 배열 출력
		System.out.println("정렬 전 : " + Arrays.toString(arr1));
		
		// 자등으로 오름차순 정렬
		Arrays.sort(arr1);
		
		System.out.println("정렬 후 : " + Arrays.toString(arr1));
		
		// 문자열 배열선언
		String [] strArr1 = {"가", "라", "마", "나", "다"};
		
		// 문자열 배열 출력
		System.out.println("String 정렬 전 : " + Arrays.toString(strArr1));
		
		// 문자열 배열 오름차순 정렬
		Arrays.sort(strArr1);
		
		System.out.println("String 정렬 후 : " + Arrays.toString(strArr1));

	}

}
