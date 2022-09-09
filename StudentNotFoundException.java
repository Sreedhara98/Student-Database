package dbms;

public class StudentNotFoundException extends RuntimeException {
	private String message;
	
	StudentNotFoundException(String message){
		this.message=message;
	}
	
	public String getMessage() {
		return message;
	}

}
