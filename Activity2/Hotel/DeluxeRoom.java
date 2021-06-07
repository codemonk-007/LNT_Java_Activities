package Hotel;

public class DeluxeRoom extends HotelRoom {
	protected int ratePerSqFeet;
	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = (hasWifi == true)? 12 : 10;
	}
	public int getRatePerSqFeet() {
		return this.ratePerSqFeet;
	}

}
