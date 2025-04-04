package Methods;

public class MethodCalling {
	public static void m1() {
		System.out.println("M1");
	}
	
	public static void m2() {
		m1();
		System.out.println("M2");
	}
	
	public static void main(String[] args) {
		m3();
		System.out.println("Main");
	}
	
	public static void m3() {
		System.out.println("M3");
		m2();
	}
	
	
}
