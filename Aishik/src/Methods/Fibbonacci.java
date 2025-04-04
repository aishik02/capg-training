package Methods;

import java.util.Scanner;

public class Fibbonacci {
	
	public static void fibonacci(int range) {
		int a=0,b=1,c=0;
		System.out.print(a+" "+b+" ");
		for (int i=2;i<range;i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int range=sc.nextInt();
		fibonacci(range);
	}
}
