package Section05.FirstLastDigitSum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FirstLastDigitSumTest {
    @Test
    public void sumFirstAndLastDigitOf101() {
        int result = FirstLastDigitSum.sumFirstAndLastDigit(101);
        assertEquals(2, result);
    }

    @Test
    public void sumFirstAndLastDigitOfnegativeOne() {
        int result = FirstLastDigitSum.sumFirstAndLastDigit(-1);
        assertEquals(-1, result);
    }

    @Test
    public void sumFirstAndLastDigitOf999() {
        int result = FirstLastDigitSum.sumFirstAndLastDigit(909990);
        assertEquals(9, result);
    }
}
