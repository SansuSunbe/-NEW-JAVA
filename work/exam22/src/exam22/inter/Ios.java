package exam22.inter;

public class Ios implements Phone {

	private int batteryCapacity = 40;
	private boolean isOn = false;

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		if (batteryCapacity > 30) {
			System.out.println("Power On");
			isOn = true;
		} else {
			System.out.println("LowBattery");
		}

	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("Power Off");
		isOn = false;

	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		if (isOn) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public void watchYoutube() {
		// TODO Auto-generated method stub
		if (batteryCapacity > 10) {
			System.out.println("watch Youtube");
			batteryCapacity -= 10;
			System.out.println("Battery is " + this.batteryCapacity + "%");
		} else {
			System.out.println("Low Battery");
			powerOff();
		}
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		if (this.batteryCapacity < Phone.MAX_BATTERY_CAPACITY) {
			System.out.println("charge start");
			// 5프로 이상 차이날때는 5를 더하고 아니면 100에서 현재 값을 뺀만큼 더하기
			if (Phone.MAX_BATTERY_CAPACITY - this.batteryCapacity > 5) {
				this.batteryCapacity += 5;
			} else {
				this.batteryCapacity += (Phone.MAX_BATTERY_CAPACITY - this.batteryCapacity);
			}
		}
	}

}
