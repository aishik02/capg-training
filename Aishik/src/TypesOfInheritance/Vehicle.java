package TypesOfInheritance;

public class Vehicle {
	private String vehicleNumber;
	private String brand;
	private String model;
	private double rentalPricePerDay;
	private boolean isAvailable;
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getRentalPricePerDay() {
		return rentalPricePerDay;
	}
	public void setRentalPricePerDay(double rentalPricePerDay) {
		this.rentalPricePerDay = rentalPricePerDay;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public Vehicle(String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.brand = brand;
		this.model = model;
		this.rentalPricePerDay = rentalPricePerDay;
		this.isAvailable = isAvailable;
	}
	
	public Vehicle() {
		
	}
	
	public void displayDetails() {
		System.out.println("Vehicle Number: "+vehicleNumber);
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Rental Price Per Day: "+rentalPricePerDay);
		System.out.println("Available: "+isAvailable);
	}
	
	public void rentVehicle() {
		if(this.isAvailable==true) {
			System.out.println("Vehicle is available and price per day is "+rentalPricePerDay);
		}
		else
			System.out.println("Vehicle is not available!");
	}
}
