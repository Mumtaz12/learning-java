package Section07.Encapsulation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    @Test
    public void testTonerLeverAfterRefill() {
        Printer printer = new Printer(50, true);
        int levelAfterAddingToner = printer.addToner(50);
        assertEquals(100, levelAfterAddingToner);
    }
}
