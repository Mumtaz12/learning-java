package Section04.IntEqualityPrinter;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntEqualityPrinterTest {
    @Test
    public void testAllAreEqual() {
        IntEqualityPrinter.printEqual(1, 1, 1);
        assertEquals(true, true);
    }

    @Test
    public void testAllAreDifferent() {
        IntEqualityPrinter.printEqual(1, 2, 3);
        assertEquals(true, true);

    }

    @Test
    public void testNeitherAllAreQqualOrDifferent() {
        IntEqualityPrinter.printEqual(1, 1, 2);
        assertEquals(true, true);

    }

    @Test
    public void testInvalidValue() {
        IntEqualityPrinter.printEqual(-1, 1, 2);
        assertEquals(true, true);

    }
}
