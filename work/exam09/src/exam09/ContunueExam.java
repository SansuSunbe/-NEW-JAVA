package exam09;

public class ContunueExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			
			// 짝수만 더해보기
			if(i % 2 != 0) {
				System.out.println(i);
				continue; // 여기에서 실행문 종료
			}
			
			sum += i;
			
		}
		
		System.out.println(sum);

	}

}
