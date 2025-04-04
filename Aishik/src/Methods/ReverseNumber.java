package Methods;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int reverse=0;
		//int original=num;
		while(num!=0) {
			reverse*=10;
			reverse+=num%10;
			num/=10;
		}
		System.out.println("Reverse is: "+reverse);
	}
}
