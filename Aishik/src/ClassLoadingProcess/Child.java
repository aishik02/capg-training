package ClassLoadingProcess;

public class Child extends Parent {
	String name="Ronaldo";
	
	void display() {
		String name="FOOTBALL";
		System.out.println(name);
		System.out.println("Child: "+this.name);
		System.out.println("Daddy: "+super.name);
		
	}
}
