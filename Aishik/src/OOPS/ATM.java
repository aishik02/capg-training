package OOPS;
import java.util.*;
public class ATM {
	public static void main(String[] args) {
		boolean run=true;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Account Number: ");
		long acc_num=sc.nextLong();
		System.out.println("Enter balance: ");
		double balance=sc.nextDouble();
		
		Account acc=new Account(name,acc_num,balance);
		
		
		while(run) {
			System.out.println("WELCOME TO THE BANKING SYSTEM!"+ "\nEnter your choice: "+"\n1. Check Balance"+"\n2. Withdraw Money"+"\n3. Deposit Money"+"\n4. Check Account Holder's Name"
					+ "\n5. Check Account Number\n6. Exit\n___________________________________________");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
			{
				System.out.println("Your current balance is: "+acc.getBalance());
				break;
			}
			
			case 2:
			{
				System.out.println("Enter money you want to withdraw: ");
				double money=sc.nextDouble();
				acc.withdraw(money);
				break;
			}
			
			case 3:
			{
				System.out.println("Enter money you want to deposit: ");
				double money=sc.nextDouble();
				acc.deposit(money);
				break;
			}
			
			case 4:
			{
				System.out.println("Account Holder's Name: "+acc.getName());
				break;
			}
			
			case 5:
			{
				System.out.println("Account Number: "+acc.getAccountNumber());
				break;
			}
			
			case 6:
			{
				run =false;
				break;
			}
		}
	}
}
}
