import org.junit.Test;

import static org.junit.Assert.*;

public class BlackJackTest {

    @Test
    public  void testBlackjack()
    {
        int y = BlackJack.blackJack(18,21);
        assertEquals(y,21);
    }



}