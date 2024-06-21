package exam09;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int target = (int)(Math.random() * 50) + 1;
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int user = 0;
		
		for(;;) {
			
			System.out.println("숫자 입력 : ");
			user = sc.nextInt();
			
			if(target == user) {
				System.out.println("정답 숫자 : " + user + " 시도 횟수 : " + count);
				break;
			} else if(target > user) {
				System.out.println("업");
			} else if(target < user) {
				System.out.println("다운");
			}
			
			count++;
			
		}
		
		sc.close();

	}

}
