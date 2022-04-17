package Section05.EvenDigitSum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EvenDigitSumTest {
    @Test
    public void evenDigitSumWithNegetiveNumber() {
        int result = EvenDigitSum.getEvenDigitSum(-1);
        assertEquals(-1, result);
    }

    @Test
    public void evenDigitSum() {
        int result = EvenDigitSum.getEvenDigitSum(222);
        assertEquals(6, result);
    }
}
