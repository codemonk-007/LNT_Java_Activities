package Vehicle;

public class Vehicle {
	protected String make;
	protected String vehicleNumber;
	protected String fuelType;
	protected int fuelCapacity;
	protected int cc;
	
	
	public Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	
	public void displayMake() {
		System.out.println("***" + this.make + "***");
	}
	
	public void displayBasicInfo() {
		 System.out.println("---Basic Information---");
		 System.out.println("Vehicle Number: " + this.vehicleNumber);
		 System.out.println("Fuel Capacity: " + this.fuelCapacity);
		 System.out.println("Fuel Type: " + this.fuelType);
		 System.out.println("CC: " + this.cc);
	}
	
	public void displayDetailInfo() {}
	
	//GETTERS SETTERS
	
	public String getMake() {
		return this.make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getVehicleNumber() {
		return this.vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	
	public String getFuelType() {
		return this.fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	public int getFuelCapacity() {
		return this.fuelCapacity;
	}
	public void setFuelCapacity(int fuel) {
		this.fuelCapacity = fuel;
	}
	
	public int getEngineCC() {
		return this.cc;
	}
	public void setEngineCC(int cc) {
		this.cc = cc;
	}
}
