
- ## JAVA 란?
	- 자바는 1991년에 썬 마이크로 시스템이라는 회사에서 개발
		- 현재는 오라클이 인수하여 운영중
	- 최초의 이름은 Ork(오크)라는 이름으로 소형가전에 필요한 프로그램을 개발하기 위해서 만들어짐
	- 인터넷이 발전함에 따라서 네트워크에 특화된 기능을 중점으로 개발되어 JAVA 라는 이름으로 1996년에 최종적으로 출시됨
	- 자바는 현재 초기버전인 JDK 1.0부터 JDK 20까지의 버전이 있음 이 중 현대에 가장 많이 사용되는건 JDK11버전부터 많이 사용됨

- ## JAVA 언어의 특징 1
	- 자바는 객체 지향 언어
		- 객체지향이란?
			- 작은 단위의 독립적 기능을 만들고, 그것들을 합쳐서 하나의 어플리케이션을 만드는 방식. 즉 작은 부품들을 만들고 그 부품들을 합쳐서 하나의 제품으로 만드는 것
		- 객체지향의 반대는?
			- 절차지향언어
	- 이식성의 유용함
		- 다른 언어와 달리 OS 환경이 달라도 JAVA 코드가 변경되지 않음 즉 다른 개발환경에서의 협업 유용
		- 자바 코드를 해석하는 JVM(Java Virtual Machine)이 설치되어 있으면 이식성이 뛰어남
		- 단 JVM은 운영체제에 맞게 설치가 필요

- ## JAVA 언어의 특징 2
	- Multi-Thread(멀티 스레드)
		- JAVA는 멀티코어 프로그래밍이 가능하다
			- 동시성(Concurrency) 
				- 멀티 작업을 위해 하나의 코어에서 멀티 스레드가 번갈아 가며 실행
			- 병렬성(Parallelism)
				- 멀티 작업을 위해 멀티 코어에서 개별 스레드를 동시에 실행
	- Garbage Collector(가비지 컬렉터)
		- 프로그램에서 사용하는 메모리를 자동으로 회수하는 기능
		- 메모리 관리를 자바 언어에서 자동으로 관리
			- 즉 사용하지 않거나 사용이 종료된 프로세스를 자동으로 관리함으로써 메모리의 사용을 최적화

- ## 자바프로그래밍 과정
	- ![](https://i.imgur.com/HSgSlhb.png)


- ## JAVA 개발 준비 
	- 자바 JDK(Java Development Kit) 설치
		- 자바 개발에 필요한 라이브러리가 있는 개발 툴
	- 개발도구 Eclipse 설치
		- 자바 개발을 위한 개발 툴

- ## JDK 설치하러 가기
	- [JDK설치](https://www.oracle.com/kr/java/technologies/downloads/#java11)
	- JAVA는 11버전부터는 64비트를 지원하지 않다.
	- 자바 11버전은 스크롤을 밑으로 내리면 찾을 수 있다.
		- ![](https://i.imgur.com/vijfgQ1.png)

- ## JAVA 개발환경 설정
	1. 내PC에 들어간 후 우클릭으로 속성 들어가기
		- ![](https://i.imgur.com/DlcTpuQ.png)
	2. 시스템창에서 고급 시스템 설정 클릭
		- ![](https://i.imgur.com/LZtP2uN.png)
	3. 환경 변수 클릭 
		- ![](https://i.imgur.com/NhIiSjY.png)
	4. 새로만들기 클릭
		- ![](https://i.imgur.com/yNsWDUM.png)
	5. 변수 이름, 변수 값 설정 
		- ![](https://i.imgur.com/b3YNuFp.png)
		- 변수 이름은 "JAVA_HOME" 으로 변수 값은 JDK가 설치된 주소로 한다.
			- ![](https://i.imgur.com/VLnGZDq.png)
	6. Path 설정 
		- Path 클릭 후 편집 클릭
			- ![](https://i.imgur.com/XZDP9sb.png)
		- 환경변수 편집에서 삭제는 누르지 않는다.
			- ![](https://i.imgur.com/bgYVmx0.png)
		- 새로 만들기 클릭 후 "%JAVA_HOME￦(역슬래쉬)bin" 입력
			- ![](https://i.imgur.com/Fu5Qbty.png)
		- 설정한 Path를 맨 위로 보내기
			- ![](https://i.imgur.com/9adSk4b.png)
	7. JAVA 설치 확인
		- 윈도우 검색창에서 cmd 입력 후 명령프롬프트 클릭
			- ![](https://i.imgur.com/753DJlo.png)
		- "java -version" 입력
			- ![](https://i.imgur.com/3vRkFb8.png)

- ## 이클립스 설치
	- [이클립스 설치](https://www.eclipse.org/downloads/packages/)
	- 엔터프라이즈 버전을 설치하면 된다.
		- ![](https://i.imgur.com/VE8irzz.png)

- ## 이클립스 설정
	- 이클립스는 다양한 환경에서의 개발을 지원하기 때문에 JAVA만 사용할려면 따로 설정해줘야한다.
		- ![](https://i.imgur.com/SiMqI7s.png)
		- ![](https://i.imgur.com/eaO1VI2.png)

	- 이클립스 자체 jdk말고 오라클 홈페이지에서 받은 jdk를 사용할 수 있도록 설정해주자
	- window -> preferences -> java -> Installed JREs
		- ![](https://i.imgur.com/tDrBVlw.png)
		- ![](https://i.imgur.com/rQF57bk.png)
		- ![](https://i.imgur.com/aLa1bR8.png)
	
		- ![](https://i.imgur.com/bjsqspm.png)
		- ![](https://i.imgur.com/8JFkqjG.png)
	- jdk가 설치된 경로까지 잡아준다.
		- ![](https://i.imgur.com/89NIt1q.png)
	- 설정된 jdk의 버전하고 이클립스 안의 컴파일러 버전까지 맞춰준다.
		- ![](https://i.imgur.com/e2nolbf.png)
