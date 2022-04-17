package Section05.LastDigitChecker;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LastDigitCheckerTest {
    @Test
    public void testAlllastDigitsAreSame() {
        boolean result = LastDigitChecker.hasSameLastDigit(41, 141, 421);
        assertEquals(true, result);
    }

    @Test
    public void testLastDigitAreNotSame() {
        boolean result = LastDigitChecker.hasSameLastDigit(41, 343, 987);
        assertEquals(false, result);
    }

    @Test
    public void testValueOutOfRange() {
        boolean result = LastDigitChecker.hasSameLastDigit(3, 23, 23);
        assertEquals(false, result);
    }

    @Test
    public void testTwoLastDigitsAreSame() {
        boolean result = LastDigitChecker.hasSameLastDigit(30, 349, 99);
        assertEquals(true, result);
    }

    // -----------------------
    @Test
    public void testAlllastDigitsAreSameShort() {
        boolean result = LastDigitChecker.hasSameLastDigitShorterMethod(41, 141, 421);
        assertEquals(true, result);
    }

    @Test
    public void testLastDigitAreNotSameShort() {
        boolean result = LastDigitChecker.hasSameLastDigitShorterMethod(41, 343, 987);
        assertEquals(false, result);
    }

    @Test
    public void testValueOutOfRangeShort() {
        boolean result = LastDigitChecker.hasSameLastDigitShorterMethod(3, 23, 23);
        assertEquals(false, result);
    }

    @Test
    public void testTwoLastDigitsAreSameShort() {
        boolean result = LastDigitChecker.hasSameLastDigitShorterMethod(30, 349, 99);
        assertEquals(true, result);
    }
}
