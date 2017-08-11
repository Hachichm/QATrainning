import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueSumTest {


    @Test
    public void testSum()
    {
        int y = UniqueSum.uniqueSum(1,1,1);
        assertEquals(y, 0);
    }
}