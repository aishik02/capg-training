package UniversityCaseStudy;
import java.util.*;
public class University {
	private ArrayList<Person> people=new ArrayList<Person>();
	
	void addPerson(Person p) {
		people.add(p);
	}
	
	void showPeople() {
		for(Person p:people) {
			p.getName();
		}
	}
}
