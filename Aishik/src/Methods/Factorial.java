package Methods;
import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		int res=1;
		for(int i=1;i<=num;i++) {
			res*=i;
		}
		System.out.println("Factorial of "+num+" = "+res);
	}
}
