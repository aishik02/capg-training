package VehicleCaseStudy;

public class Bike extends AbstractVehicle {
	public Bike() {
	}

	public Bike(String name, int speed) {
		super(name, speed);
	}
	
	public void start() {
		System.out.println("Bike is Started!");
	}
	
	public void stop() {
		System.out.println("Bike is Stopped!");
	}
	
	public void displayType() {
		System.out.println("Type: Bike");
	}
}
