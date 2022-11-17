import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(1, RoomType.SINGLE, 55);
    }

    @Test
    public void bedroomHasCapacity(){
        assertEquals(1, bedroom.getRoomCapacity());
    }
}
