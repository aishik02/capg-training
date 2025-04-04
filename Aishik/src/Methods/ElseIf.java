package Methods;

import java.util.Scanner;

public class ElseIf {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter op1: ");
		int op1=sc.nextInt();
		
		System.out.println("Enter operator: ");
		int op2=sc.nextInt();
		
		System.out.println("Enter operator: ");
		char operator=sc.next().charAt(0);
		
		if(operator=='+')
			System.out.println(op1+op2);
		else if(operator=='-')
			System.out.println(op1-op2);
		else if(operator=='*')
			System.out.println(op1*op2);
		else if(operator=='/')
			System.out.println(op1/op2);
		else
			System.out.println("Invalid operator!");
	}
}
