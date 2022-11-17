import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        hotel = new Hotel("The Overlook");
        bedroom = new Bedroom(1, RoomType.SINGLE);
        guest = new Guest("Indy");

    }

    @Test
    public void canCheckGuestIn(){
        bedroom.checkGuestIntoRoom(guest);
        assertEquals(1, bedroom.checkGuestListNumber());
    }

    @Test
    public void canCheckGuestOut(){
        bedroom.checkGuestIntoRoom(guest);
        bedroom.checkGuestOutOfRoom(guest);
        assertEquals(0, bedroom.checkGuestListNumber());
    }


}
