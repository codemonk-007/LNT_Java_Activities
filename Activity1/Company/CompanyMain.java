package Company;


import java.util.Scanner;

public class CompanyMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Company company1 = new Company();
		
		System.out.println("Enter Company Name: ");
		String name = input.nextLine();
		company1.setCompanyName(name);
		
		System.out.println("Enter Employees: ");
		String employees = input.nextLine();
		company1.setEmployees(employees);
		
		System.out.println("Enter Team Lead: ");
		String teamlead = input.nextLine();
		
		while(!employees.contains(teamlead)) {
			System.out.println("Invalid Input! Try Again: ");
			teamlead = input.nextLine();
		}
		company1.setTeamLead(teamlead);
		
		company1.displayCompanyDetails();
		input.close();
	}
}
