package exam02;

public class ChangeTypeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNum01 = 15;
		long longNum01 = 20;
		byte byteNum01 = 0;
		
		// 자동형변환
		longNum01 = intNum01;
		
		// 강제형변환
		byteNum01 = (byte)intNum01;
		
		int intNum02 = 130;
		byte byteNum02 = 0;
		
		byteNum02 = (byte)intNum02;
		
		System.out.println("형변환1 int " + intNum01 + " -> long " + longNum01);
		System.out.println("형변환2 int " + intNum01 + " -> byte " + byteNum01);
		System.out.println("형변환3 int " + intNum02 + " -> byte " + byteNum02);
		
	}

}
