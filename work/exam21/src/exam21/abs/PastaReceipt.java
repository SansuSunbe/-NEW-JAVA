package exam21.abs;

public class PastaReceipt extends Receipt{
	
	public PastaReceipt(String chef) {
		super(chef);
	}
	
	public void makeSource() {
		System.out.println("수제 파스타 소스");
	}

}
