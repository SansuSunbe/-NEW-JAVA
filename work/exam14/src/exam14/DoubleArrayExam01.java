package exam14;

import java.util.Arrays;
import java.util.Scanner;

public class DoubleArrayExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] std = new int [3][3];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < std.length; i++) {
			System.out.println((i + 1) + " 번째 학생 국어점수 : ");
			std[i][0] = scan.nextInt();
			System.out.println((i + 1) + " 번째 학생 영어점수 : ");
			std[i][1] = scan.nextInt();
			System.out.println((i + 1) + " 번째 학생 수학점수 : ");
			std[i][2] = scan.nextInt();
		}
		
		// Arrays.toString(1차원배열 출력)
		for(int i = 0; i < std.length; i++) {
			System.out.println((i + 1) + " 번째 학생 : " + Arrays.toString(std[i]));
		}
		
		scan.close();
		
		// 1등 뽑기
		int maxIndex = 0;
		int sum = 0; // 총점 저장 변수
		int maxSum = 0;
		
		for(int i = 0; i < std.length; i++) {
			sum = 0; // 합산 초기화
			for(int j = 0; j < std[i].length; j++) {
				sum += std[i][j];
			}
			
			// 합이 끝난 후 비교
			if(maxSum < sum) {
				maxSum = sum;
				maxIndex = i;
			}
		}
		
		System.out.println("1등 : " + (maxIndex + 1) + "번 학생 : " + Arrays.toString(std[maxIndex]) + "총점 : " + maxSum);
		
	}
}
