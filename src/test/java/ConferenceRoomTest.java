import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;
    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("Conference Room 1", 50);
    }

    @Test
    public void conferenceRoomHasName(){
        assertEquals("Conference Room 1", conferenceRoom.getName());
    }

    @Test
    public void conferenceRoomHasCapactiy(){
        assertEquals(50, conferenceRoom.getCapacity());
    }
}
