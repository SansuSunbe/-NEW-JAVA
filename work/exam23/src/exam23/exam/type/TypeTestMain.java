package exam23.exam.type;

public class TypeTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bus bus = new Bus("버스");
		Taxi taxi1 = new Taxi("택시1");
		
		// 형변환
		Car car = taxi1;
		
		bus.getInfo();
		taxi1.getInfo();
		
		// 부모타입으로 형변환 되면 자식 클래스가 가진 기능이나 속성을 사용할 수 없다.
		// car.getInfo();
		
		Taxi taxi2 = (Taxi)car;
		
		taxi2.getInfo();

	}

}
