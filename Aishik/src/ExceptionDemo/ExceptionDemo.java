package ExceptionDemo;

public class ExceptionDemo {
	public static int returnInt() {
		try {
			return 1;
		}
		catch(Exception e){
			return 2;
		}
		finally {
			return 3;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(returnInt());
	}
}
