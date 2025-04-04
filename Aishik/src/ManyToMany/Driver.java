package ManyToMany;
import java.util.*;
public class Driver {
	public static void main(String[] args) {

		Subject python=new Subject("Python",30);
		Subject java=new Subject("JAVA",60);
		Subject c=new Subject("C++",50);

		Scanner sc=new Scanner(System.in);

		boolean enroll=true;

		while(enroll) {
			System.out.println("Enter Student's Name: ");
			String name=sc.nextLine();
			System.out.println("Enter Student's Email: ");
			String email=sc.nextLine();

			Student student=new Student(name,email);

			boolean again=true;
			while(again) {
				System.out.println("Enter your choice: "+"\n1. JAVA"+"\n2. Python"+"\n3. C++"+"\n4. Show Subjects"+"\n5. Exit");
				int choice=sc.nextInt();

				switch(choice) {
				case 1:
					student.addSubject(java);
					java.addStudent(student);
					break;
				case 2:
					student.addSubject(python);
					python.addStudent(student);
					break;
				case 3:
					student.addSubject(c);
					c.addStudent(student);
					break;
				case 4:
					student.displaySubjects();
					break;
				case 5:
					again=false;;
					break;
				}
			}
			System.out.println("Enroll another student? Y/N: ");
			char ch = sc.next().charAt(0);
			if (ch=='n') {
				enroll=false;
			}
		}
		python.displayStudents();
		java.displayStudents();
		c.displayStudents();
		sc.close();
	}
}


