package Employee1;



public class Employee1 {
	private String name;
	private String address;
	private String mobile;
	
	// NAME
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// ADDRESS
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	// MOBILE
	public String getPhone() {
		return this.mobile;
	}
	
	public void setPhone(String mobile) {
		this.mobile = mobile;
	}
	
	//DISPLAY DETAILS
	public void displayDetails() {
		System.out.println("Employee Details");
		System.out.println("Name: " + this.getName());
		System.out.println("Address: " + this.getAddress());
		System.out.println("Mobile: " + this.getPhone());
	}
}

