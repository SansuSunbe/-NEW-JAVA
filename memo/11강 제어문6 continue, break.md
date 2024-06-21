
- ## continue란?
	- 반복문의 현재 진행중인 반복만 건너뛰고 다음 반복으로 넘어가게 하는 키워드
	- 반복문 전체를 종료하지 않고 특정 조건을 만족하는 경우 다음 반복으로 즉시 이동

- ## continue 예시 1
	- ![](https://i.imgur.com/9evrLco.png)

- ## break란?
	- 반복문이나 switch-case문의 실행을 중단하고 바깥 코드로 이동하게 하는 키워드

- ## break 예시 1
	- ![](https://i.imgur.com/2Xfc0WW.png)

- ## break 예시 2
	- for문에 조건식 대신 ;;를 넣으면 무한루프가 된다.
	~~~
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
	~~~ 