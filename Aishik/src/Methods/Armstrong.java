package Methods;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int num=sc.nextInt();
		int copy1=num;
		int copy2=num;
		int count=0;
		int sum=0;
		while(copy1!=0) {
			copy1/=10;
			count++;
		}
		while(num!=0) {
			sum+=Math.pow((num%10),count);
			num/=10;
		}
		
		if (sum==copy2)
			System.out.println("Armstrong number");
		else
			System.out.println("Not armstrong number");
	}
}
