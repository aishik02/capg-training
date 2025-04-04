package UtilityClasses;

public class CalciDriver {
	public static void main(String[] args) {
		Calculator c = new Calculator(23.5,45.5);
		Calculator.add(c).mul(c); //method chaining
		System.out.println(c.getResult());
	}
}
