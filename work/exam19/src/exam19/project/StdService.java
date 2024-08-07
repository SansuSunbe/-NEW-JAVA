package exam19.project;

import java.util.Scanner;

public class StdService {

	private Student[] stdArray;

	// 생성자를 통한 초기화
	public StdService() {
		this.stdArray = new Student[3];
	}

	// 학생을 생성하는 메서드
	public void createStudent() {
		Scanner scan = new Scanner(System.in);

		System.out.println("== 학생 생성 ==");
		for (int i = 0; i < stdArray.length; i++) {
			System.out.println((i + 1) + " 번째 학생 이름 : ");
			String myName = scan.next();
			System.out.println((i + 1) + " 번째 학생 국어점수");
			int kor = scan.nextInt();
			System.out.println((i + 1) + " 번째 학생 영어점수");
			int eng = scan.nextInt();
			System.out.println((i + 1) + " 번째 학생 수학점수");
			int math = scan.nextInt();

			// 학생 객체 생성
			Student st = new Student(myName, kor, eng, math);

			// 배열에 저장
			stdArray[i] = st;
		}

		System.out.println("== 학생 생성 완료 ==");

		scan.close();

	}

	// 성적순대로 학생 정보 출력
	public void printStudent() {
		Student temp = null;
		for (int i = stdArray.length; i < 0; i--) {
			for (int j = 0; j < (i - 1); j++) {
				if (stdArray[j].getTotal() < stdArray[j + 1].getTotal()) {
					temp = stdArray[j + 1];
					stdArray[j + 1] = stdArray[j];
					stdArray[j] = temp;  
				}
			}
		}

		// 출력
		for (int i = 0; i < stdArray.length; i++) {
			Student st = stdArray[i];
			System.out.print("이름 : " + st.getMyName() + ", ");
			System.out.print("국어 : " + st.getKor() + ", ");
			System.out.print("영어 : " + st.getEng() + ", ");
			System.out.print("수학 : " + st.getMath() + ", ");
			System.out.print("총점 : " + st.getTotal() + ", ");
			System.out.print("평균 : " + st.getAvg() + "\n");
		}
	}

}
