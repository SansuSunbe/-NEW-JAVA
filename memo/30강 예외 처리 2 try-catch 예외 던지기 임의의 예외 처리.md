# 30강 예외 처리 2 : try-catch / 예외 던지기 / 임의의 예외 처리

## 예외 처리 과정

1. 코드 진행 중 예외가 발생하면 JVM에게 알림
2. JVM은 발생한 예외를 분석하여 알맞은 예외 클래스 생성
3. 생성된 예외 객체를 발생한 지점으로 보냄
4. 예외가 발생한 지점에서 처리하지 않으면 프로그램 강제 종료

## try-catch 문법

```java
try{
	// 예외가 발생할 가능성이 있는 코드
} catch(예외 클래스명 e) {
	// 예외 처리 코드
}
```

## try-catch 예시

```java
package exam26.exam.excp;

public class TryCatchExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num = 15;
			int result = num / 10;

			System.out.println("결과 : " + result);
			
			Integer a = null;
			
			System.out.println(a / 10);
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
			// e.printStackTrace(); // 내부에서 에러난 내용 전체 출력
			System.out.println(e.getMessage()); // 에러 메시지만 출력
		} catch (NullPointerException e) {
			System.out.println("사용하려는 객체가 존재하지 않음");
		}
		
		System.out.println("종료");
		//				출력
		//        결과 : 1
		//				사용하려는 객체가 존재하지 않음
		//				종료

	}

}
```

## 다중 catch 예시

```java
package exam26.exam.excp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		try {
			
			int [] cards = {4, 2, 5, 6, 7, 1, 3};
			
			System.out.print("카드 선택 : ");
			
			int cardIndex = scan.nextInt();
			
			System.out.println("뽑은 카드 번호 : " + cards[cardIndex]);
			
		} catch (InputMismatchException e) {
			System.out.println("키 입력이 잘못됨");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("선택된 배열 위치가 잘못됨");
		} finally {
			// 예외 발생 유무와 상관 없이 무조건 실행
			System.out.println("예외 끝");
			scan.close();
		}
		
		// 출력
		// 카드 선택 : 1
		// 뽑은 카드 번호 : 2
		// 예외 끝

	}

}
```

## finally란?

- finally 블록은 예외 발생 유무와 상관 없이 실행되며 생략이 가능함
- 예외 처리를 할 때 예외와 상관 없이 반드시 처리해야 하는 구문들을 작성할 때 사용되며, 보통 외부 연동이나 예외가 발생해도 정상 종료 되어야 할 구문들에서 주로 사용됨

## 예외 던지기란?

- 오류가 발생했을 때, 이를 상위 호출자에게 알려 처리하는 매커니즘
- 특정 메서드에서 문제가 발생하면 그 문제를 해당 메서드를 호출한 곳으로 넘겨 처리하도록 하는 것

## 예외 던지기 종류

- throw : 특정 예외 객체를 생성하여 강제로 던지는 경우
- thorws : 메서드 선언부에 예외 클래스를 명시하여, 해당 메서드에서 발생할 수 있는 예외를 알리는 경우

## 예외 던지기 예시

```java
package exam26.exam.excp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowableExam {

	public static void checkYourSelf(Scanner scan) throws InputMismatchException {

		System.out.println("1. 외향적 / 2. 내향적");
		System.out.print("선택 : ");

		int check = scan.nextInt();

		if (check == 1) {
			System.out.println("MBTI : E");
		} else if (check == 2){
			System.out.println("MBTI : I");
		} else {
			System.out.println("1 과 2 중에 선택");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		try {
			
			System.out.println("성격 유형 검사");
			ThrowableExam.checkYourSelf(scan);
			
		} catch (InputMismatchException e) {
			System.out.println("키보드 입력이 잘못됨");
		} finally {
			if (scan != null) {
				scan.close();
			}
		}
		
		// 출력
		// 성격 유형 검사
		// 1. 외향적 / 2. 내향적
		// 선택 : a
		// 키보드 입력이 잘못됨

	}

}
```

## 임의의 예외 처리란?

- 시스템이나 프로그램 상 오류가 없다 해도 프로그램의 진행 상 문제가 생길 경우 발생시키는 예외

## 임의의 예외 처리 예시

```java
package exam26.exam.excp;

import java.util.Scanner;

public class InputNumberExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int val = 0;

		while (true) {

			try {

				System.out.println("숫자 입력 (범위 : 1 ~ 50) : ");
				val = scan.nextInt();

				if (val == -1) {
					System.out.println("종료");
					break;
				} else if (val > 50 || val < 1) {
					throw new Exception("숫자의 허용 범위 아님");
				}

			} catch (Exception e) {
				scan.nextLine(); // 입력 받기전에 이전 내용 flush (flush : 메모리에서 지움)
				System.out.println(e.getMessage() == null ? "입력에 문제 발생" : e.getMessage());
			}
		}
		
		if(scan != null) {
			scan.close();
		}
		
		// 출력
		// 숫자 입력 (범위 : 1 ~ 50) : 
		// 50
		// 숫자 입력 (범위 : 1 ~ 50) : 
		// -10
		// 숫자의 허용 범위 아님
		// 숫자 입력 (범위 : 1 ~ 50) : 
		// 60
		// 숫자의 허용 범위 아님
		// 숫자 입력 (범위 : 1 ~ 50) : 
		// a
		// 입력에 문제 발생
		// 숫자 입력 (범위 : 1 ~ 50) : 
		
	}
}
```

## 커스텀 예외 처리 객체 예시

1. Exception 을 상속 받는 클래스 생성

```java
package exam26.exam.excp;

public class CustomException extends Exception {
	
	private String message;
	
	public CustomException() {
		
	}
	
	public CustomException (String message) {
		this.message = message;
	}
	
	public String getMeString() {
		return message;
	}

}
```

1. 커스텀한 예외 처리 클래스를 실행할 Main 함수 생성

```java
package exam26.exam.excp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		try {

			System.out.print("나이 입력 : ");
			int age = scan.nextInt();

			if (age < 1) {
				throw new CustomException("입력 범위 오류");
			} else if (age < 8) {
				System.out.println("유아");
			} else if(age < 15) {
				System.out.println("어린이");
			} else if(age < 19) {
				System.out.println("청소년");
			} else {
				System.out.println("성인");
			}

		} catch (CustomException e) {
			System.out.println(e.getMessage() == null ? "입력 범위 오류" : e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage() == null ? "입력 오류" : e.getMessage());
		}

	}

}
```
