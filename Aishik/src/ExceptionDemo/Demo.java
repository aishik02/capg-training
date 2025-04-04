package ExceptionDemo;

public class Demo {
	public static void printNumber() throws InterruptedException{
		for (int i=0;i<=10;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	
	public static void demo(){
		try {
			printNumber();
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}
	
	public static void main(String[] args){
		demo();
	}
}
