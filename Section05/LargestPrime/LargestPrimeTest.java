package Section05.LargestPrime;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LargestPrimeTest {


    @Test
    public void testGetLargestPrime21() {
        assertEquals(7, LargestPrime.getLargestPrime(21));
    }    @Test
    public void testGetLargestPrime217() {
        assertEquals(31, LargestPrime.getLargestPrime(31));
    }    @Test
    public void testGetLargestPrime0() {
        assertEquals(-1, LargestPrime.getLargestPrime(0));
    }    @Test
    public void testGetLargestPrime45() {
        assertEquals(5, LargestPrime.getLargestPrime(45));
    }    @Test
    public void testGetLargestPrimeNegativeOne() {
        assertEquals(-1, LargestPrime.getLargestPrime(-1));
    }
}
