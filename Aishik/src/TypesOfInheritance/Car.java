package TypesOfInheritance;

public class Car extends Vehicle{
	private int numberOfDoors;
	
	
	
	public Car() {
		super();
	}



	public Car(String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable, int numberOfDoors) {
		super(vehicleNumber, brand, model, rentalPricePerDay, isAvailable);
		this.numberOfDoors=numberOfDoors;
	}



	public int getNumberOfDoors() {
		return numberOfDoors;
	}



	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public void displayDetails() {
		System.out.println("Number of Doors: "+numberOfDoors);
		super.displayDetails();
		System.out.println("==================================");
	}
}
