package Methods;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int firstNum=sc.nextInt();
		System.out.println("Enter second number:");
		int secondNum=sc.nextInt();
		System.out.println("Enter third number:");
		int thirdNum=sc.nextInt();
		
		if(firstNum>secondNum && firstNum>thirdNum)
			System.out.println("First number "+firstNum+" is largest");
		if(secondNum>firstNum && secondNum>thirdNum)
			System.out.println("Second number "+secondNum+" is largest");
		else
			System.out.println("Third number "+thirdNum+" is largest");
		
	}
}
