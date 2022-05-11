package Section08.ReverseArray;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseArrayTest {
    @Test
    public void reverseArray() {
        int[] array = { 1, 2, 3, 4, 5 };
        ReverseArray.reverse(array);
        int[] reversedArray = { 5, 4, 3, 2, 1 };
        for (int i = 0; i < array.length; i++) {
            assertEquals(reversedArray[i], array[i]);
        }

    }
}
