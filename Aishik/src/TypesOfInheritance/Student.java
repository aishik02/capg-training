package TypesOfInheritance;

public class Student extends Person{
	private int studentId;
	
	Student(){
		
	}
	
	Student(int studentId){
		this.studentId=studentId;
	}
	
	Student(String name,int age,int studentId){
		this.studentId=studentId;
		super.setName(name);
		super.setAge(age);
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	void displayDetails() {
		super.displayPersonDetails();
		System.out.println("Student Id: "+this.studentId);
	}
}
