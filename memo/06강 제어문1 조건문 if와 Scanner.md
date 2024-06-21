
- ## 제어문이란?
	- 프로그램의 흐름을 제어하는데 사용되는 문장

- ## 조건문 if란?
	- 제어문 중 하나로써, 특정 조건이 참일 때 실행할 코드 블록을 결정하는 키워드

- ## if문 예시
	- else는 if구문이 거짓일 때 실행되며 꼭 else가 쓰일 필요는 없다.(if 하나만 있어도 무관)
	- ![](https://i.imgur.com/yawGSVu.png)

- ## Scanner란?
	- 키보드로 입력을 받는데 사용되는 클래스
	- 자바에서 제공 하는 기능이 있는 util 패키지에 있는 클래스이기 때문에 임포트(import)하여 사용해야한다.

- ## Scanner 주요 메서드
	- `nextLine()`: 한 줄의 문자열을 입력받음
	- `next()`: 공백(스페이스, 탭)을 기준으로 문자열을 입력받음
	- `nextInt()`: 정수를 입력받음
	- `nextDouble()`: 실수를 입력받음
	- `nextBoolean()`: true 또는 false를 입력받음
	- `hasNextLine()`: 다음 줄에 입력 가능한 문자열이 있는지 확인
	- `hasNextInt()`: 다음 입력값이 정수인지 확인
	- `hasNextDouble()`: 다음 입력값이 실수인지 확인
	- `hasNextBoolean()`: 다음 입력값이 true 또는 false인지 확인

- ## Scanner 사용 예시
	- 사용 후에는 close() 메서드를 사용하여 닫아주어야 한다.(메모리 누수 방지) 
	- ![](https://i.imgur.com/4izs6m4.png)

- ## if else if else 문법
	~~~
	if (조건식) {
		조건이 참일 때 실행할 명령;
	} else if (조건식) {
		위의 조건이 거짓일 때 실행할 명령;
	} else {
		위의 모든 조건이 거짓일 때 실행할 명령;
	}
	~~~

- ## else if를 활용한 Scanner 예시
	- else if란?
		- if문법에서 if 조건이 여러개일 때 사용하는 문법이다.
		- 첫 번째 조건이 거짓일 때 실행된다.
	- ![](https://i.imgur.com/TlwukZ8.png)

- ## import 단축키
	- ctrl + Shift + O
	- Scanner 같은 다른 패키지에 있는 클래스를 사용해야 할 때는 import하여 사용해야한다.
