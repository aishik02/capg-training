package TypesOfInheritance;

public class Bike extends Vehicle {
	private boolean hasGear;
	
	
	
	public Bike() {
		super();
	}

	public Bike(String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable, boolean hasGear) {
		super(vehicleNumber, brand, model, rentalPricePerDay, isAvailable);
		this.hasGear=hasGear;
	}

	public boolean isHasGear() {
		return hasGear;
	}

	public void setHasGear(boolean hasGear) {
		this.hasGear = hasGear;
	}

	public void displayDetails() {
		System.out.println("Has Gear: "+hasGear);
		super.displayDetails();
		System.out.println("==================================");
	}
}
