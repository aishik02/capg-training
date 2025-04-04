package VehicleCaseStudy;

public abstract class AbstractVehicle implements Vehicle {
	protected String name;
	protected int speed;
	
	public AbstractVehicle() {
		super();
	}

	public AbstractVehicle(String name, int speed) {
		super();
		this.name = name;
		this.speed = speed;
	}
	
	void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Speed: "+getCurrentSpeed());
	}
	
	public void accelerate(int increment) {
		speed=speed+increment;
	}
	
	public void brake(int decrement) {
		speed=speed-decrement;
	}
	
	public int getCurrentSpeed() {
		return this.speed;
	}
	
	

}
