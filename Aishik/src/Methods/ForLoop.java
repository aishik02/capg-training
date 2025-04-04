package Methods;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter range i.e. 1-10: ");
		String s = scanner.nextLine();
		Scanner sc=new Scanner(s);
		sc.useDelimiter("-");
		
		int lower=sc.nextInt();
		int upper=sc.nextInt();
		int sum=0;
		
		if(upper<lower)
			System.out.println("Invalid Range!");
		else {
			for(int i=lower;i<=upper;i++) {
				if(i%2!=0)
					sum+=i;
			}
			System.out.println("Sum: "+sum);
		}
		
	}
}
