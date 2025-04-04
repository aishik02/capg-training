package Abstraction;

public class Calculate extends Calculator{
	@Override
	double mul(double a,double b) {
		return a*b;
	}
	@Override
	double div(double a,double b) {
		return a/b;
	}
}
