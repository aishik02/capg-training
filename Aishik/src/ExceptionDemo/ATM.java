package ExceptionDemo;

public class ATM {
	double money;
	int pin;
	
	public ATM(double money, int pin) {
		super();
		this.money = money;
		this.pin = pin;
	}

	public void withdraw(double amount,int pin) throws InvalidMoney,IncorrectPin {
		if(pin==this.pin) {
			if(amount<=this.money && amount>0){
				System.out.println("Money Withdrawn!");
				this.money-=amount;
			}
			else {
				throw new InvalidMoney();
			}
		}
		else {
			throw new IncorrectPin();
		}
	}
	
	public static void main(String[] args) {
		ATM a=new ATM(1000,123);
		a.withdraw(3000, 123);
	}
}
