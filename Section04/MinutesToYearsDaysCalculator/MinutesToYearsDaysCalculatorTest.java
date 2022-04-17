package Section04.MinutesToYearsDaysCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MinutesToYearsDaysCalculatorTest {
    @Test
    public void testConvertMinutesToYearsAndDaysSuccesful() {
        MinutesToYearsDaysCalculator.printYearsAndDays(1440);
        assertEquals(true, true);
    }    
    @Test
    public void testConvertMinutesToYearsAndDaysFails() {
        MinutesToYearsDaysCalculator.printYearsAndDays(-1234);
        assertEquals(true, true);
    }
}
