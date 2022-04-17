package Section05.DayOfTheWeekChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DayOfTheWeekChallengeTest {
    @Test
    public void testFindSunday() {
        String result = DayOfTheWeekChallenge.printDayOfTheWeek(0);
        assertEquals("Sunday", result);
    }

    @Test
    public void testFindMonday() {
        String result = DayOfTheWeekChallenge.printDayOfTheWeek(1);
        assertEquals("Monday", result);
    }

    @Test
    public void testFindTuesday() {
        String result = DayOfTheWeekChallenge.printDayOfTheWeek(2);
        assertEquals("Tuesday", result);
    }

    @Test
    public void testFindWednesday() {
        String result = DayOfTheWeekChallenge.printDayOfTheWeek(3);
        assertEquals("Wednesday", result);
    }

    @Test
    public void testFindThursday() {
        String result = DayOfTheWeekChallenge.printDayOfTheWeek(4);
        assertEquals("Thursday", result);
    }

    @Test
    public void testFindFriday() {
        String result = DayOfTheWeekChallenge.printDayOfTheWeek(5);
        assertEquals("Friday", result);
    }

    @Test
    public void testFindSaturday() {
        String result = DayOfTheWeekChallenge.printDayOfTheWeek(6);
        assertEquals("Saturday", result);
    }

    @Test
    public void testFindInvalidDay() {
        String result = DayOfTheWeekChallenge.printDayOfTheWeek(7);
        assertEquals("Invalid day", result);
    }
    @Test
    public void testFindInvalidDayNegativeValue() {
        String result = DayOfTheWeekChallenge.printDayOfTheWeek(-1);
        assertEquals("Invalid day", result);
    }
}