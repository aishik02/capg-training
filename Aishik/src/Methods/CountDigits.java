package Methods;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int num=sc.nextInt();
		int oddCount=0;
		int evenCount=0;
		while(num!=0) {
			if((num%10)%2==0) {
				evenCount+=1;
			}
			else
				oddCount+=1;
			num/=10;
		}
		System.out.println("Product: "+(evenCount*oddCount));
	}
}
