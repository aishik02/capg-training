package UtilityClasses;

public class Circle {
	private double radius;
	private double diameter;
	private double perimeter;
	private double area;
	
	
	Circle(double radius){
		this.radius=radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius=radius;
	}
	
	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public Circle diameter() {
		this.diameter=this.radius*2;
		return this;
	}
	
	public Circle perimeter() {
		this.perimeter=(this.diameter)*Math.PI;
		return this;
	}
	
	public Circle area() {
		this.area=Math.pow((this.radius),2)*Math.PI;
		return this;
	}

}
