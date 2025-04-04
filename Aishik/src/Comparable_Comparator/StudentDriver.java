package Comparable_Comparator;

import java.util.Arrays;

public class StudentDriver {
	public static void main(String[] args) {
		Student[] students= {
				new Student(1,"Aishik",99.99),
				new Student(4,"Aiindrila",99.90),
				new Student(5,"Aniket",69.69),
				new Student(2,"Shounak",69.6969),
		};
		
		Arrays.sort(students);
		
		for (Student s:students) {
			System.out.println(s);
		}
	}
}
