package Section05.PerfectNumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PerfectNumberTest {
    @Test
    public void testPerfectNumber6(){
        boolean result = PerfectNumber.isPerfectNumber(6);
        assertEquals(true, result);
    }
    @Test
    public void testPerfectNumber28(){
        boolean result = PerfectNumber.isPerfectNumber(28);
        assertEquals(true, result);
    }
    @Test
    public void testPerfectNumber5(){
        boolean result = PerfectNumber.isPerfectNumber(5);
        assertEquals(false, result);
    }
    @Test
    public void testPerfectNumberNegativeOne(){
        boolean result = PerfectNumber.isPerfectNumber(-1);
        assertEquals(false, result);
    }
}
