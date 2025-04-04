package ObjectClass;
import java.util.*;
public class Student {
	private int id;
	private String name;
	private double percentage;
	
	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	@Override
	public String toString() {
		return "ID: "+this.id+"\tName: "+this.name+"\tPercentage"+this.percentage;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s=(Student) obj;
		return this.name.equals(s.name) && this.id==s.id && this.percentage==s.percentage;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.id,this.name,this.percentage);
	}
	
}
