package Vehicle;

public class FourWheeler extends Vehicle{
	private String audioSystem;
	private int numberOfDoors;

	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, String audioSystem, int numberOfDoors) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.audioSystem = audioSystem;
		this.numberOfDoors = numberOfDoors;
	}
	 
	public void displayDetailInfo() {
		System.out.println("---Detailed Information---");
		System.out.println("Audio System: " + this.audioSystem);
		System.out.println("Number of Doors: " + this.numberOfDoors);
	}
	
	public String getAudioSystem() {
		return this.audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	
	public int getNumberOfDoors() {
		return this.numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
}
