package Vehicle;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Vehicle vehicle = null;
		
		
		System.out.println("1.Four Wheeler");
		System.out.println("2.Two Wheeler");
		System.out.println("Enter Vehicle Type: ");
		String VehicleType = input.next();
		while (!VehicleType.equals("1") && !VehicleType.equals("2") ) {
			System.out.println("Invalid Input! Try Again: ");
			VehicleType = input.next();
		}

		System.out.println("Vehicle Make: ");
		String VehicleMake = input.next();
		
		System.out.println("Vehicle Number: ");
		String VehicleNumber = input.next();
		
		System.out.println("Fuel Type: ");
		System.out.println("1.Petrol \n2.Diesel");
		String fuelType = input.next();
		while (!fuelType.equals("1") && !fuelType.equals("2")) {
			System.out.println("Invalid fuel type! Try Again: ");
			fuelType = input.next();
		}
		fuelType = (fuelType.equals("1")) ? "Petrol" : "Diesel";
		
		System.out.println("Fuel Capacity: ");
		int fuelCapacity = input.nextInt();
		
		System.out.println("Engine CC: ");
		int cc = input.nextInt();
		
		switch (VehicleType) {
		case "1":
			System.out.println("Audio System: ");
			String audioSystem = input.next();
			
			System.out.println("Number Of Doors: ");
			int numberOfDoors = input.nextInt();
			
			vehicle = new FourWheeler(VehicleMake, VehicleNumber, fuelType, fuelCapacity, cc, audioSystem, numberOfDoors);
			break;
		case "2":
			System.out.println("Kick Availability (yes/no): ");
			boolean kickAvailability = (input.next().toLowerCase().equals("yes")? true : false);
			
			vehicle = new TwoWheeler(VehicleMake, VehicleNumber, fuelType, fuelCapacity, cc, kickAvailability);
			break;
			
		}
		vehicle.displayMake();
		vehicle.displayBasicInfo();
		vehicle.displayDetailInfo();
		input.close();
	}
}
