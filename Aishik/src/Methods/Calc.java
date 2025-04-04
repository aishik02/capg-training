package Methods;

public class Calc {
	public static int sub(int a,int b) {
		return a-b;
	}
	public static int sub(int a,int b,int c) {
		return a-b-c;
	}
	public static double mul(double a,double b) {
		return a*b;
	}
	public static int mul(int a,int b,int c) {
		return a*b*c;
	}
	
	public static void main(String[] args) {
		System.out.println(sub(5,6));
		System.out.println(sub(5,6,8));
		System.out.println(mul(5,6.9));
		System.out.println(mul(5,6,8));
	}
}
