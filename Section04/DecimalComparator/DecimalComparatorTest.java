package Section04.DecimalComparator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DecimalComparatorTest {
    @Test
    public void testTwoEqualDecimal() {
        assertEquals(true, DecimalComparator.areEqualByThreeDecimalPlaces(10.0000, 10.0000));
    }
    @Test
    public void testTwoUnequalDecimal() {
        assertEquals(false, DecimalComparator.areEqualByThreeDecimalPlaces(10.00100, 10.0000));
    }
}
