package hotelReservationSystem;
/**
 * Class for getter and setter methodss
 * @author Surjyamani Duan
 *
 */
public class Hotel {
	/**
	 * Creating instance variables
	 */
    private String hotelName;
    private float hotelRegularRate;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public float getHotelRegularRate() {
        return hotelRegularRate;
    }

    public void setHotelRegularRate(float hotelRegularRate) {
        this.hotelRegularRate = hotelRegularRate;
    }

    public Hotel(String hotelName, float hotelRegularRate) {
        this.hotelName = hotelName;
        this.hotelRegularRate = hotelRegularRate;

    }
}