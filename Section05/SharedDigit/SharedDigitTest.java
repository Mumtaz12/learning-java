package Section05.SharedDigit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SharedDigitTest {
    @Test
    public void testSharedDigit() {
        boolean result = SharedDigit.hasSharedDigit(12, 23);
        assertEquals(true, result);
    }

    @Test
    public void testNoSharedDigit() {
        boolean result = SharedDigit.hasSharedDigit(11, 22);
        assertEquals(false, result);
    }
}
