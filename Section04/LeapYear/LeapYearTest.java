package Section04.LeapYear;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LeapYearTest {
    @Test
    public void testNoLeapYear1700() {
        assertEquals(false, LeapYear.isLeapYear(1700));
    }
    @Test
    public void testNoLeapYear1800() {
        assertEquals(false, LeapYear.isLeapYear(1800));
    }
    @Test
    public void testNoLeapYear1900() {
        assertEquals(false, LeapYear.isLeapYear(1900));
    }
    @Test
    public void testNoLeapYear2100() {
        assertEquals(false, LeapYear.isLeapYear(2100));
    }
    @Test
    public void testNoLeapYear2200() {
        assertEquals(false, LeapYear.isLeapYear(2200));
    }
    @Test
    public void testNoLeapYear2300() {
        assertEquals(false, LeapYear.isLeapYear(2300));
    }
    @Test
    public void testNoLeapYear2500() {
        assertEquals(false, LeapYear.isLeapYear(2500));
    }
    @Test
    public void testLeapYear1600() {
        assertEquals(true, LeapYear.isLeapYear(1600));
    }
    @Test
    public void testLeapYear2000() {
        assertEquals(true, LeapYear.isLeapYear(2000));
    }
    @Test
    public void testLeapYear2400() {
        assertEquals(true, LeapYear.isLeapYear(2400));
    }
}