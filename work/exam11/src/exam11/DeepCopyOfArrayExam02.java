package exam11;

public class DeepCopyOfArrayExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] cards = {1, 6, 9, 8, 2, 7};
		int [] newCards = new int [6];
		
		// 복사 메서드를 이용해서 깊은 복사 하기
		// 원본 배열, 
		// 원본 배열에서 복사를 시작할 위치, 
		// 대상 배열, 
		// 대상 배열에 복사를 시작할 위치, 
		// 복사할 요소의 개수(길이)
		System.arraycopy(cards, 0, newCards, 0, newCards.length);
		
		cards[1] = 11;
		newCards[3] = 20;
		
		System.out.println("cards : ");
		for(int i = 0; i < cards.length; i++) {
			System.out.print(cards[i] + "\t");
		}
		
		System.out.println();
		
		System.out.println("newCards : ");
		for(int i = 0; i < newCards.length; i++) {
			System.out.print(newCards[i] + "\t");
		}

	}

}
