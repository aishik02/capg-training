package OOPS;

public class Employee {
	private String name= "Aishik";
	private int age=72;
	private long phone_num=8645384564l;
	private double salary=0.0;
	
	//getter methods
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public long getPhoneNumber() {
		return this.phone_num;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	//setter methods
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setPhoneNumber(long phone_num) {
		this.phone_num=phone_num;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
}
