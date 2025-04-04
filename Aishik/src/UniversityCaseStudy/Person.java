package UniversityCaseStudy;
import java.util.*;
public class Person {
	
	private String name;
	private int age;
	
	Person(){
		
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void displayInfo() {
		System.out.println(name);
		System.out.println(age);		
	}

}
