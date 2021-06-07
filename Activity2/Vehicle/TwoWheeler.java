package Vehicle;

public class TwoWheeler extends Vehicle {
	private boolean kickStartAvailable;
	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, boolean kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.kickStartAvailable = kickStartAvailable;
	}
	
	public void displayDetailInfo() {
		System.out.println("---Detailed Information---");
		System.out.println("Kick Start Available: " + (this.kickStartAvailable ? "YES" : "NO"));
	}
	
	public boolean getKickStartAvailable() {
		return this.kickStartAvailable;
	}
	public void setKickStartAvailable(boolean isKick) {
		this.kickStartAvailable = isKick;
	}
	
	
}
