package TypesOfInheritance;

public class Person {
	private String name;
	private int age;
	
	Person(){
		
	}
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	void displayPersonDetails() {
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);		
	}
}
