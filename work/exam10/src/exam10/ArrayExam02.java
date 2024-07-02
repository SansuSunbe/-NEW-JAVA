package exam10;

public class ArrayExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[10];
		
		// i = index의 줄임말(추측)
		// for문을 이용한 배열에 값 삽입
		for(int i = 0; i < 10; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		
		// length : 배열의 크기 반환
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
			sum += arr[i];
		}
		
		System.out.println("\n합 : " + sum);

	}

}
