import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;
    @Before
    public void before(){
        bedroom = new Bedroom(1, RoomType.SINGLE, 80);
        booking = new Booking( bedroom, 3);
    }

    @Test
    public void checkNightsBooked(){
        assertEquals(3, booking.getNumberOfNights());
    }

    @Test
    public void canFindTotalCostOfBooking(){
        assertEquals(240, booking.getTotalPriceForBooking());
    }
}
