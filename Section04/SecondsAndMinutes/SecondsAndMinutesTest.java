package Section04.SecondsAndMinutes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SecondsAndMinutesTest {
    @Test
    public void testConvertNegativeMinutesAndPositiveSecondsFails() {
        String result = SecondsAndMinutes.getDurationString(-1, 10);
        assertEquals("Invalid value", result);
        System.out.println(result);
    }

    @Test
    public void testConvertSecondsToTimeStringSuccessful() {
        String result = SecondsAndMinutes.getDurationString(12200);
        assertEquals("03h 23m 20s", result);
        System.out.println(result);
    }

    @Test
    public void testConvertMinutesAndSecondsSuccessful() {
        String result = SecondsAndMinutes.getDurationString(61, 0);
        assertEquals("01h 01m 00s", result);
        System.out.println(result);
    }
}
