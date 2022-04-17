package Section05.FlourPacker;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FlourPackerTest {
    @Test
    public void testCanPackFails() {
        assertEquals(false, FlourPacker.canPack(1, 0, 4));
    }

    @Test
    public void testCanPackSuccessful() {
        assertEquals(true, FlourPacker.canPack(1, 0, 5));
    }

    @Test
    public void testCanPackWithOneBagLeftSuccessful() {
        assertEquals(true, FlourPacker.canPack(0, 5, 4));
    }

    @Test
    public void testCanPackTooWithOneBagLeftSuccessful() {
        assertEquals(true, FlourPacker.canPack(2, 2, 11));
    }

    @Test
    public void testCanPackNegativeValueFails() {
        assertEquals(false, FlourPacker.canPack(-3, 2, 12));
    }

    @Test
    public void testCanPack() {
        assertEquals(true, FlourPacker.canPack(2, 1, 5));
    }

}
