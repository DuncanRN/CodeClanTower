import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    DiningRoom diningRoom;

    @Before
    public void before(){
        diningRoom = new DiningRoom("the Gold Room", 100);
    }

    @Test
    public void diningRoomHasName(){
        assertEquals("the Gold Room", diningRoom.getName());
    }

}
