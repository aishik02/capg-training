package Methods;

import java.util.Scanner;

public class Pallindrome {
	
	public static boolean checkPallindrome(int num) {
		int reverse=0;
		int original=num;
		while(num!=0) {
			reverse*=10;
			reverse+=num%10;
			num/=10;
		}
		if (original==reverse)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		int num=sc.nextInt();
		System.out.println(checkPallindrome(num));
	}
}
