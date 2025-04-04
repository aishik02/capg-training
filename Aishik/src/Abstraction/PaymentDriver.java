package Abstraction;

import java.util.Scanner;

public interface PaymentDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Credit Card Payment"+"\n2. PayPal Payment"+"\n\nEnter your choice: ");
		int choice=sc.nextInt();
		System.out.println("Enter amount to be paid: ");
		double amount=sc.nextDouble();
		System.out.println("Enter Transaction ID: ");
		long transaction_id=sc.nextLong();
		double toPay=0;
		switch(choice) {
		case 1:
		{
			Payment p=new CreditCardPayment(amount,transaction_id);
			CreditCardPayment c=(CreditCardPayment) p;
			toPay=c.processPayment();
			System.out.println("Amount to be paid: "+toPay);
			System.out.println("===================================");
			break;
		}
		case 2:
		{
			Payment p=new PayPalPayment(amount,transaction_id);
			PayPalPayment c=(PayPalPayment) p;
			toPay=c.processPayment();
			System.out.println("Amount to be paid: "+toPay);
			System.out.println("===================================");
			break;
		}
		default:
			System.out.println("Enter a valid choice!");
		}
	}
}
