package Methods;
import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean num=sc.nextBoolean();
		System.out.println(num);
		
		boolean num2=sc.nextBoolean();
		System.out.println(num2);
		
		String st=sc.nextLine();
		System.out.println(st);
		//System.out.println(sc.next().charAt(0));
		
	}
}
