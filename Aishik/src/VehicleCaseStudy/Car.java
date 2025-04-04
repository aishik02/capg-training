package VehicleCaseStudy;

public class Car extends AbstractVehicle {

	public Car() {
	}

	public Car(String name, int speed) {
		super(name, speed);
	}
	
	public void start() {
		System.out.println("Car is Started!");
	}
	
	public void stop() {
		System.out.println("Car is Stopped!");
	}
	
	public void displayType() {
		System.out.println("Type: Car");
	}
}
