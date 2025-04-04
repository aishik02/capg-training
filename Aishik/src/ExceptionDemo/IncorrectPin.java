package ExceptionDemo;

public class IncorrectPin extends RuntimeException{
	private static String message="Incorrect PIN!";
	
	IncorrectPin(){
		super(message);
	}
	
	IncorrectPin(String msg){
		super(msg);
	}
	
	
}
