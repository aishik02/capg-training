package ExceptionDemo;

public class InvalidMoney extends RuntimeException{
	private static String message="Invalid Amount!";
	
	InvalidMoney(){
		super(message);
	}
	
	InvalidMoney(String msg){
		super(msg);
	}
}
