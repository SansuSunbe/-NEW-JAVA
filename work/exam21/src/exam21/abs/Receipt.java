package exam21.abs;

public abstract class Receipt {
	
	private String chef;
	
	public Receipt(String chef) {
		this.chef = chef;
	}
	
	public void info() {
		System.out.println(this.chef + "의 레시피");
	}

}
