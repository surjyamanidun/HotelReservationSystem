package hotelReservationSystem;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class for test case
 * @author Surjyamani Dwan
 *
 */
public class HotelReservationTest {
    HotelReservationSystem hotelReservation = new HotelReservationSystem();

    @Test
    public void addedHotel() {
        
            boolean isValid1 = hotelReservation.addHotel( new Hotel("LakeWood",110));
            Assert.assertTrue(isValid1);
            boolean isValid2 = hotelReservation.addHotel( new Hotel("Bridgewood",160));
            Assert.assertTrue(isValid2);
            boolean isValid3 = hotelReservation.addHotel( new Hotel("Ridgewood",220));
            Assert.assertTrue(isValid3);
        }
}