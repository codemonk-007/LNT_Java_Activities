package Employee1;


import java.util.Scanner;

public class EmployeeMain1 {
	public static void displaymenu() {
		System.out.println("Menu");
		System.out.println("1. Update The Employee Name");
		System.out.println("2. Update The Employee Address");
		System.out.println("3. Update The Employee Mobile Number");
		System.out.println("4. All Data Correct/ Exit");
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String name, address, mobile;
		
		// Employee Object
		Employee1 employee1 = new Employee1();
		
		System.out.println("Enter Name: ");
		name = input.nextLine();
		employee1.setName(name);
		
		System.out.println("Enter Address: ");
		address = input.nextLine();
		employee1.setAddress(address);
		
		System.out.println("Enter Mobile: ");
		mobile = input.nextLine();
		employee1.setPhone(mobile);
		
		// Update Details
		System.out.println("\nVerify And Update The Details:\n");
		String choice = "";
		while (!choice.equals("4")) {
			displaymenu();
			choice = input.nextLine();
			switch(choice) {
				case "1":
					System.out.println("Current Name: " + employee1.getName());
					System.out.println("Enter Name: ");
					name = input.nextLine();
					employee1.setName(name);
					break;
				case "2":
					System.out.println("Current Address: " + employee1.getAddress());
					System.out.println("Enter Address: ");
					address = input.nextLine();
					employee1.setAddress(address);
					break;
				case "3":
					System.out.println("Current Mobile Number: " + employee1.getPhone());
					System.out.println("Enter Mobile: ");
					mobile = input.nextLine();
					employee1.setPhone(mobile);
					break;
			}
		}

		employee1.displayDetails();
		input.close();
		
	}
}
