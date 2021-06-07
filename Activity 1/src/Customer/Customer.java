package Customer;

public class Customer {
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
	
	public void displayCustomerDetails() {
		System.out.println("Name: " + this.name);
		System.out.println("Address: " + this.address);
		System.out.println("Mobile: " + this.mobile);
	}
}
