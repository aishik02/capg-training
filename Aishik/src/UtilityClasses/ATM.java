package UtilityClasses;

public class ATM {
	public static void main(String[] args) {
		BankAccount b=new BankAccount();
		b.deposit(10000).deposit(5000).withdraw(2500);
		System.out.println(b.getBalance());
	}
}
