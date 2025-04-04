package Inheritence;

public class Class {
	private int grade;
	private Student[] students;
	
	public int getGrade() {
		return this.grade;
	}
	
	public Student[] getStudents() {
		return this.students;
	}
	
	Class(int grade){
		this.grade=grade;
		this.students=new Student[10];
	}

	int i=0;
	public void createStudent(String name) {
		students[i]=new Student(name);
		i++;
	}
	
	public void display() {
		for(Student s: this.students) {
			if(s!=null) {
				System.out.println(s.getName());
			}
		}
	}	
	
}
