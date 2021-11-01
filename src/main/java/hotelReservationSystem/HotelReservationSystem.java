package hotelReservationSystem;
import java.util.ArrayList;
import java.util.List;

/**
 * Purpose  - To build a Hotel Reservation System
 *@author Surjyamani Duan
 * */
public class HotelReservationSystem {
     List<Hotel> hotels = new ArrayList<Hotel>();
     /**
     * This method is used to add hotel to the Hotel List
     */
    public boolean addHotel(Hotel hotel) {
        return hotels.add(hotel);
    }
}
