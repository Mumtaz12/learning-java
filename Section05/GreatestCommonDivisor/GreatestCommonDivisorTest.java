package Section05.GreatestCommonDivisor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GreatestCommonDivisorTest {
    @Test
    public void testFindCommonDivisorOf12And30() {
        int result = GreatestCommonDivisor.getGreatestCommonDivisor(12, 30);
        assertEquals(6, result);
    }

    @Test
    public void testFindCommonDivisorOf11And12() {
        int result = GreatestCommonDivisor.getGreatestCommonDivisor(11, 12);
        assertEquals(1, result);
    }

    @Test
    public void testNumberOutOfRange() {
        int result = GreatestCommonDivisor.getGreatestCommonDivisor(4, 12);
        assertEquals(-1, result);
    }
}
