package VehicleCaseStudy;

public class Truck extends AbstractVehicle{
	public Truck() {
	}

	public Truck(String name, int speed) {
		super(name, speed);
	}
	
	public void start() {
		System.out.println("Truck is Started!");
	}
	
	public void stop() {
		System.out.println("Truck is Stopped!");
	}
	
	public void displayType() {
		System.out.println("Type: Truck");
	}
}
