package Section08.SortedArray;

import org.junit.Test;

import static Section08.SortedArray.SortedArray.sortIntegers;
import static org.junit.Assert.assertEquals;

public class SortedArrayTest {
    @Test
    public void test() {
        int[] unsortedArray = {23, 40, 21, 5, 33};
        int[] descendingArray = {40, 33, 23, 21, 5};
        int[] sortedArray = sortIntegers(unsortedArray);
        for (int i = 0; i < unsortedArray.length; i++) {
            assertEquals(descendingArray[i], sortedArray[i]);
        }
    }
}
