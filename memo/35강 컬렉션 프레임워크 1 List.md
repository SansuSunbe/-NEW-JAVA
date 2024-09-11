# 35강 컬렉션 프레임워크 1 : List

## 컬렉션 프레임워크

- 자바에서 데이터 저장 방식의 불편함을 개선하기 위해 필요한 자료 구조를 미리 구현해놓은 것
- java.util 패키지를 통해 제공함
- 기존에 있던 List(리스트), Queue(큐), Tree(트리) 등의 자료 구조를 컬렉션이라 하고, 프레임워크는 클래스와 인터페이스를 묶어 놓은 개념
- 즉 컬렉션 프레임워크란 기존에 존재했던 자료 구조에 인터페이스로 설계된 기능을 클래스를 통해 제공하여 데이터 관리에 용이한 자료 구조 객체를 ‘구조화’한 것

## 컬렉션 구조

- Map은 컬렉션 구조가 아니며 별개의 구조임
- List와 Set은 인터페이스며 하위 클래스들이 구현해 놓은 것
- Collection
    - List
        - ArrayList
        - Vector
        - LinkedList
    - Set
        - HashSet
        - TreeSet
- Map
    - HashMap
    - TreeMap

## List

- ArrayList
- LinkedList
- Vector(잘 사용 안함)

## Generic(제네릭)

- 클래스가 다루어야 할 데이터 타입을 명시하는 것
- 클래스가 다루어야 할 객체 타입을 외부에서 지정하여 관리할 수 있는 기술
- 제네릭을 이용하여 컬렉션 프레임워크가 저장할 자료형(데이터 타입)을 지정하는 것

## 제네릭 선언 및 생성

```java
public class 클래스명<T> {
	...
}
public interface 인터페이스명<T>{
	...
}
```

- 위에서 사용된 <T>를 ‘타입 변수(type variable)’라고 하며, 이를 이용해 타입을 제한함
- 여러 개의 타입 변수는 쉽표(,)로 구분하여 명시할 수있음
- 타입 파라미터는 정해진 규칙은 없지만 일반적으로 알파뱃 대문자 한 글자로 표현됨

| 타입 변수 | 의미 |
| --- | --- |
| <T> | Type |
| <E> | Element |
| <K> | Key |
| <N> | Number |
| <V> | Value |

## List 주요 메서드

| 메서드 | 동작 | 기능 설명 |
| --- | --- | --- |
| void add(E e) | 삽입 | 데이터를 순차적으로 삽입 |
| void add(int index, E e)  | 중간 삽입 | 원하는 index 위치에 삽입 |
| void set(int index, E e) | 치환 | 원하는 index 위치의 값을 변경 |
| E get(int index) | 반환 | 선택된 index 위치의 값을 반환 |
| void remove(int index) | 삭제 | 선택된 index 위치의 값을 삭제 |
| void clear() | 전체 삭제 | 모든 데이터 삭제 |
| int size() | 크기 | 저장된 데이터의 개수를 반환 |
| boolean contains(Object o) | 검색 | 데이터 존재 여부 확인 |

## List 예시

```java
package exam31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		모든 리스트는 리스트 인터페이스를 상속받는 구현체이기 때문에
//		다형성과 형변환을 이용하기 위해 List를 부모타입으로 객체화하여 사용함
//		ArrayList<Integer> list01 = new ArrayList<>();
		
		List<Integer> list = new ArrayList<>();
		
		// 추가
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		// 중간 삽입
		// 기존 데이터는 삭제되지 않고 뒤로 밀림
		list.add(5, 10);
		list.add(1, 20);
		
		// 치환
		list.set(0, 5);
		list.set(4, 13);
		
		System.out.println(list);
		
		// 삭제
		// index 공간이 지워지며 하나씩 밀린다.
		list.remove(4);
		list.remove(3);
		
		System.out.println(list);
		
		// 출력
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		
		System.out.println("\n----------");
		
		for(int val : list) {
			System.out.print(val + "\t");
		}
		
		System.out.println("\n----------");
		
		// iterator를 이용한 출력
		Iterator<Integer> iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next() + "\t");
		}

//		결과 : 
//		[5, 20, 2, 3, 13, 5, 10]
//		[5, 20, 2, 5, 10]
//		5	20	2	5	10	
//		----------
//		5	20	2	5	10	
//		----------
//		5	20	2	5	10	

	}

}
```

## LinkedList

- 데이터와 다음 데이터의 주소를 가지는 노드(Node)객체가 연결되어 데이터를 저장하는 자료 구조
- ArrayList는 배열을 이용해 데이터를 저장하는 방식이면, LinkedList는 node라는 객체를 생성하여 인접한 데이터를 링크(연결)해서 체인처럼 관리함
- 배열로 만든건 아니라서 index는 없음
- 데이터가 중간 삽입되게 되면 기존 데이터의 주소 사이에 새로운 데이터의 주소가 추가되며 기존 데이터는 새로운 데이터의 주소를 가지게 된다.

## 용도

- LinkedList
    - 중간 삽입, 삭제
- ArrayList
    - 단순 삽입, 삭제

## 정리

- 컬렉션 프레임워크
    - 데이터를 다룰 때 사용되는 주요 자료구조
    - 기존의 List, Map, Set 등의 자료 구조를 뜻하고 프레임워크는 클래스와 인터페이스를 묶어 놓은 개념
- List 컬렉션
    - 배열과 비슷하게 index로 객체를 관리함 다만, 배열과는 다르게 크기의 제한이 없으며 삽입, 삭제, 변경의 기능이 자유로움
    - 대표적으로 ArrayList와 LinkedList가 있음
- ArrayList
    - 데이터를 순차적으로 저장하며 데이터가 삽입될 때마다 크기가 증가하고 배열을 삭제하면 공간이 줄어듬
    - index를 기준으로 값을 삽입하거나 추출함
    - 데이터를 출력하거나 검색할 경우에 용이
- LinkedList
    - Node 객체를 기반으로 데이터를 저장함 Node 객체는 데이터와 자신 다음에 올 데이터의 주소를 값으로 가짐
    - 데이터의 삽입과 삭제가 빈번할 경우 용이
