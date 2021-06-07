package Customer;

import java.util.Scanner;

public class CustomerMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Customer customer = new Customer();
		
		System.out.println("Enter the details: ");
		String[] details = input.nextLine().split(",");
		
		customer.setName(details[0]);
		customer.setAddress(details[1]);
		customer.setPhone(details[2]);
		
		customer.displayCustomerDetails();
		input.close();
	}
}
	