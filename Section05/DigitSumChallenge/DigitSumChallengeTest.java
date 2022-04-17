package Section05.DigitSumChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DigitSumChallengeTest {
    @Test
    public void testGetSumDigits() {
        int sumOfDigits = DigitSumChallenge.sumDigits(542);
        System.out.println("The sum of all digits is " + sumOfDigits);
        assertEquals(11, sumOfDigits);
    }

    @Test
    public void testGetSumDigitsOfSeven() {
        int sumOfDigits = DigitSumChallenge.sumDigits(7);
        assertEquals(-1, sumOfDigits);
    }

    @Test
    public void testGetSumDigitsOfZero() {
        int sumOfDigits = DigitSumChallenge.sumDigits(0);
        assertEquals(-1, sumOfDigits);
    }

    @Test
    public void testGetSumDigitsOfNegativeOne() {
        int sumOfDigits = DigitSumChallenge.sumDigits(-1);
        assertEquals(-1, sumOfDigits);
    }
}
