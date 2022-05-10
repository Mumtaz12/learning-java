package Section08.MinimumElement;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import static Section08.MinimumElement.MinimumElement.*;

public class MinimumElementTest {
    @Test
    public void testFindMinimumInteger() {
        int[] integers = { 23, 2, 3, 4, -23, 332, 23 };
        int lowestInteger = findMin(integers);
        assertEquals(-23, lowestInteger);
    }
}
