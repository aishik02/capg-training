package Comparable_Comparator;

public class Student implements Comparable{
	int roll_num;
	String name;
	double percentage;
	public Student(int roll_num, String name, double percentage) {
		this.roll_num = roll_num;
		this.name = name;
		this.percentage = percentage;
	}
	
	@Override
	public String toString() {
		return roll_num+"\t"+name+"\t"+percentage;
	}
	
	@Override
	public int compareTo(Object o) {
		Student s=(Student) o;
		return Double.compare(s.percentage, this.percentage);
	}
	
}
