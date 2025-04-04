package ManyToMany;
import java.util.*;
public class Student {
	private String name;
	private String email;
	private ArrayList<Subject> subjects=new ArrayList<Subject>();
	
	Student(String name, String email){
		this.name=name;
		this.email=email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Subject> getSubjects() {
		return subjects;
	}
	public void setSubject(ArrayList<Subject> subjects) {
		this.subjects = subjects;
	}
	
	public void addSubject(Subject subject) {
		subjects.add(subject);
	}
	
	public void displaySubjects() {
		System.out.println("subjects for "+this.name+" :");
		for(Subject s:this.subjects) {
			System.out.println(s.getSub_name());
		}
	}
}
