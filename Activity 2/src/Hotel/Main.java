package Hotel;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		HotelRoom room = null;
		
		System.out.println("Hotel Tariff Calculator");
		System.out.println("1. Deluxe Room");
		System.out.println("2. Deluxe AC Room");
		System.out.println("3. Suite AC Room");
		System.out.println("Select Room Type: ");
		
		String choice = input.next();
		while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
			System.out.println("Invalid Input! Try Again: ");
			choice = input.next();
		}
		
		String hotelName; int numberOfSqFeet; boolean hasTV; boolean hasWifi;
		
		System.out.println("Hotel Name: ");
		hotelName = input.next();
		
		System.out.println("Room Area (Sq Feet): ");
		numberOfSqFeet = input.nextInt();
		
		System.out.println("Room has TV (yes/no)");
		hasTV = (input.next().toLowerCase().equals("yes"))? true: false;
		System.out.println("Room has Wifi (yes/no)");
		hasWifi = (input.next().toLowerCase().equals("yes"))? true: false;
		
		switch(choice) {
		case "1":
			room = new DeluxeRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
			break;
		case "2":
			room = new DeluxeACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
			break;
		case "3":
			room = new SuiteACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
			break;
			
		}
		
		System.out.println("Room Tariff Per Day: " + room.calculateTariff());
		
		input.close();

	}

}
