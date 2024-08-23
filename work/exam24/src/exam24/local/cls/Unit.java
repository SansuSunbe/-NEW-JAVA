package exam24.local.cls;

public class Unit {

	private int speed = 10;

	public void getUnit(String type, String unitName) {

		class Tank {
			public void move() {
				System.out.println(unitName + "의 속도 : " + speed + "km");
			}
		}

		class Ship {
			public void move() {
				System.out.println(unitName + "의 속도 : " + speed + "km");
			}
		}

		Tank t = null;
		Ship s = null;
		if (type.equals("Ship")) {
			s = new Ship();
			s.move();
		} else if (type.equals("Tank")) {
			t = new Tank();
			t.move();
		}

	}

}
