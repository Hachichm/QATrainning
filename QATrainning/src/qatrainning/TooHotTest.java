import org.junit.Test;

import static org.junit.Assert.*;

public class TooHotTest {

    @Test
    public void testTooHot()
    {
        boolean y = TooHot.weather(90,true);
        assertEquals(y,true);

    }

}