package Methods;

public class Calculator {
	public static double addDouble(double firstNum, double secondNum) {
		return firstNum+secondNum;
	}
	
	public static int multiplyDouble(double firstNum, double secondNum, double thirdNum) {
		return (int)(firstNum*secondNum*thirdNum);
	}
	
	public static void main(String[] args) {
		System.out.println(addDouble(41.8,27.2));
		System.out.println(multiplyDouble(12.3,23.5,56.6));
	}
}
