package Section05.NumberToWords;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberToWordsTest {
    @Test
    public void testNumberToWords() {
        NumberToWords.numberToWords(1234567890);
    }

    @Test
    public void testDigitCouter100() {
        assertEquals(4, NumberToWords.getDigitCount(1002));
    }

    @Test
    public void testDigitCouterNegativeValue() {
        assertEquals(-1, NumberToWords.getDigitCount(-23));
    }

    @Test
    public void testReverseNumber() {
        assertEquals(4321, NumberToWords.reverse(1234));
    }

    @Test
    public void testReverseNegativeNumber() {
        assertEquals(-4321, NumberToWords.reverse(-1234));
    }
}
