package UtilityClasses;

public class CircleDriver {
	public static void main(String[] args) {
		Circle c=new Circle(5);
		System.out.println(c.diameter().perimeter().area());
		System.out.println(c.getRadius());
		System.out.println(c.getDiameter());
		System.out.println(c.getPerimeter());
		System.out.println(c.getArea());
	}
}
