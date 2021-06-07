package Hotel;

public class SuiteACRoom extends HotelRoom {
	private int ratePerSqFeet;
	public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = (hasWifi) ? 17 : 15;
	}
	public int getRatePerSqFeet() {
		return this.ratePerSqFeet;
	}
}
