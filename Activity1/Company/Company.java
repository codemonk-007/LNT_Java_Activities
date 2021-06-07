package Company;


public class Company {
	private String name;
	private String[] employees;
	private String teamlead;
	
	public String getCompanyName() {
		return this.name;
	}
	public void setCompanyName(String name) {
		this.name = name;
	}
	
	public String getEmployees() {
		return String.join(", ", this.employees);
	}
	public void setEmployees(String employees) {
		this.employees = employees.replaceAll("\\s", "").split(",");
	}
	
	public String getTeamLead(){
		return this.teamlead;
	}
	public void setTeamLead(String teamlead) {
		this.teamlead = teamlead;
	}
	public void displayCompanyDetails() {
		System.out.println("Name: " + this.getCompanyName());
		System.out.println("Employees: " + this.getEmployees());
		System.out.println("Team Lead: " + this.getTeamLead());
	}
}
