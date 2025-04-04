package Abstraction;

public class CreditCardPayment extends Payment {
	
	
	public CreditCardPayment(){
		super();
	}

	public CreditCardPayment(double amount, long transactionId) {
		super(amount, transactionId);
	}

	@Override
	public double processPayment() {
		double amount=getAmount();
		double discount=0;
		if (getAmount()>=500) {
			discount=0.1*amount;
			amount-=discount;
		}
		System.out.println("Processing Credit Card Payment...");
		System.out.println("===================================");
		System.out.println("Transaction ID: "+getTransactionId());
		System.out.println("Original Amount: "+getAmount());
		double transaction_fee=0.02*amount;
		System.out.println("Discount Applied: "+discount);
		System.out.println("Transaction Fee: "+transaction_fee);
		System.out.println("===================================");
		amount=amount+transaction_fee;
		return amount;
	}
	
}
