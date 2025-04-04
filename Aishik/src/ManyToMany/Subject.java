package ManyToMany;
import java.util.*;
public class Subject {
	private String sub_name;
	private int duration;
	private ArrayList<Student> students=new ArrayList<Student>();
	
	Subject(String sub_name, int duration){
		this.sub_name=sub_name;
		this.duration=duration;
	}

	public String getSub_name() {
		return sub_name;
	}

	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public ArrayList<Student> getStudents() {
		return this.students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	public Subject addStudent(Student student) {
		this.students.add(student);
		return this;
	}
	
	public void displayStudents() {
		System.out.println("Students for "+this.sub_name+" :");
		for(Student s:this.students) {
			System.out.println(s.getName());
		}
	}
	
}
