package VehicleCaseStudy;

import java.util.Scanner;

public class VehicleTest {
	public static void main(String[] args) {
		AbstractVehicle vehicle;
		Car c;
		Bike b;
		Truck t;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Car\n2. Bike\n3. Truck\nEnter your choice: ");
		int choice=sc.nextInt();
		String name;
		int speed=0;
		switch(choice) {
		case 1: 
		{
			System.out.println("Enter Car Name: ");
			name=sc.next();
			System.out.println("Enter speed: ");
			speed=sc.nextInt();
			vehicle=new Car(name,speed);
			c=(Car)vehicle;
			c.displayType();
			c.displayDetails();
			c.start();
			System.out.println("Enter Acceleration: ");
			int acc=sc.nextInt();
			c.accelerate(acc);
			System.out.println("Accelerated by "+acc);
			System.out.println("Current Speed: "+c.getCurrentSpeed());
			System.out.println("Enter Deceleration: ");
			int dec=sc.nextInt();
			c.brake(dec);
			System.out.println("Decelerated by "+dec);
			System.out.println("Current Speed: "+c.getCurrentSpeed());
			
			c.stop();
			break;
		}
		case 2:
		{
			System.out.println("Enter Bike Name: ");
			name=sc.next();
			System.out.println("Enter speed: ");
			speed=sc.nextInt();
			vehicle=new Bike(name,speed);
			b=(Bike)vehicle;
			b.displayType();
			b.displayDetails();
			b.start();
			System.out.println("Enter Acceleration: ");
			int acc=sc.nextInt();
			b.accelerate(acc);
			System.out.println("Accelerated by "+acc);
			System.out.println("Current Speed: "+b.getCurrentSpeed());
			System.out.println("Enter Deceleration: ");
			int dec=sc.nextInt();
			b.brake(dec);
			System.out.println("Decelerated by "+dec);
			System.out.println("Current Speed: "+b.getCurrentSpeed());
			
			b.stop();
			break;
		}
		case 3:
		{
			System.out.println("Enter Truck Name: ");
			name=sc.next();
			System.out.println("Enter speed: ");
			speed=sc.nextInt();
			vehicle=new Truck(name,speed);
			t=(Truck)vehicle;
			t.displayType();
			t.displayDetails();
			t.start();
			
			System.out.println("Enter Acceleration: ");
			int acc=sc.nextInt();
			t.accelerate(acc);
			System.out.println("Accelerated by "+acc);
			System.out.println("Current Speed: "+t.getCurrentSpeed());
			System.out.println("Enter Deceleration: ");
			int dec=sc.nextInt();
			t.brake(dec);
			System.out.println("Decelerated by "+dec);
			System.out.println("Current Speed: "+t.getCurrentSpeed());
			t.stop();
			break;
		}
		}
		
	}
}
