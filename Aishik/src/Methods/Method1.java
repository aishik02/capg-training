package Methods;

public class Method1 {
	public static int charAscii(char c) {
		return c;
	}
	
	public static void fullName(String firstName, String lastName) {
		System.out.println("Full name: "+firstName+" "+lastName);
	}
	
	public static void main(String[] args) {
		System.out.println(charAscii('h'));
		fullName("Aaloo","Kabli");
	}	
}
