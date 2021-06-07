package Employee;
import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name, address, mobile;
		
		
		// Employee Object
		Employee employee1 = new Employee();
		
		//User Input
		System.out.println("Enter Name: ");
		name = input.nextLine();
		employee1.setName(name);
		
		System.out.println("Enter Address: ");
		address = input.nextLine();
		employee1.setAddress(address);
		
		System.out.println("Enter Mobile: ");
		mobile = input.nextLine();
		employee1.setPhone(mobile);
		
		employee1.displayDetails();
		
		input.close();
		
	}
}
