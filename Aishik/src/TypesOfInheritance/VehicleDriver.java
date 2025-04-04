package TypesOfInheritance;

public class VehicleDriver {
	public static void main(String[] args) {
		Bike r15=new Bike("ABC123","Yamaha","R15",1000,true,true);
		Car pagani=new Car("XYZ789","Pagani","Zonda",50000,true,2);
		
		r15.displayDetails();
		pagani.displayDetails();
		
		pagani.rentVehicle();
	}
}
