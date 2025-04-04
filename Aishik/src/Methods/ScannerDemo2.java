package Methods;

import java.util.Scanner;

public class ScannerDemo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a string: ");
		String st=sc.nextLine();
		
		System.out.println(a+st);
	}
}
