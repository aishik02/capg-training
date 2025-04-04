package Inheritence;

public class Driver {
	public static void main(String[] args) {
		Passport passport=new Passport("12345");
		Person person=new Person("Aishik",passport);
		
		System.out.println(person.getPassport());
		System.out.println(person.getPassport().getPassport_number());
	}
}
