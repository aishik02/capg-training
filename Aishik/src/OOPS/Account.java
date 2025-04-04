package OOPS;
import java.util.*;
public class Account {
	
	private String name;
	private double balance;
	private long acc_number;
	
	Account(String name, long acc_number, double balance){
		this.name=name;
		this.balance=balance;
		this.acc_number=acc_number;
	}
	
	//getter methods
		public String getName() {
			return this.name;
		}
		
		public double getBalance() {
			return this.balance;
		}
		
		public long getAccountNumber() {
			return this.acc_number;
		}
		
		//setter methods
		public void setName(String name) {
			this.name=name;
		}
		
		public void setAccountNumber(long acc_number) {
			this.acc_number=acc_number;
		}
		
		public void setBalance(double balance) {
			this.balance=balance;
		}
		
		//withdraw method
		public double withdraw(double money) {
			double curr_balance=this.balance;
			if(money<=0) {
				System.out.println("Enter a valid amount!");
			}
			else if(curr_balance>money) {
				System.out.println("Available Balance: "+curr_balance);
				curr_balance-=money;
				System.out.println("You've successfully withdrawn: Rs "+money);
				System.out.println("Current Balance: "+curr_balance);
			}
			else
				System.out.println("Can't Withdraw! Your current balance is: "+curr_balance);
			this.balance=curr_balance;
			return curr_balance;
		}
		
		//deposit method
		public double deposit(double money) {
			double curr_balance=this.balance;
			if(money<=0) {
				System.out.println("Enter a valid amount!");
			}
			else{
				System.out.println("Previous Balance: "+curr_balance);
				curr_balance+=money;
				System.out.println("You've successfully deposited: Rs "+money);
				System.out.println("Current Balance: "+curr_balance);
			}
			this.balance=curr_balance;
			return curr_balance;
		}
		
}	
