package Methods;
import java.util.Scanner;
public class ConditionalStatement {
	public static void main(String[] args) {
		int price=50;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the money you have CHINCHAN: ");
		double money=sc.nextDouble();
		
		if(money>=price) 
			System.out.println("CONGO! You can have the Ice Cream!");
		else 
			System.out.println("Hatt gareeb!");
		sc.close();
	}
}
