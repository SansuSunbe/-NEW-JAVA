package exam12;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [] arr1 = {5, 7, 1, 4, 11, 9, 10, 2, 4, 3};
		
		System.out.println("정렬 전 : " + Arrays.toString(arr1));
		
		// 내림차순 정렬
		Arrays.sort(arr1, Comparator.reverseOrder());
		
		System.out.println("정렬 후 : " + Arrays.toString(arr1));
		
	}

}
