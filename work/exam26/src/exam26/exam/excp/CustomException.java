package exam26.exam.excp;

public class CustomException extends Exception {
	
	private String message;
	
	public CustomException() {
		
	}
	
	public CustomException (String message) {
		this.message = message;
	}
	
	public String getMeString() {
		return message;
	}

}
