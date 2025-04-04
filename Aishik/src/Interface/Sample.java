package Interface;

public interface Sample {
	//public static final
	int a=10;
	
	static void display() {
		System.out.println("dia1+play");
	}
	
	void task();
	
	private void sample() {
		System.out.println("Private method");
	}
	
	default void task2() {
		System.out.println("Default method");
	}
}