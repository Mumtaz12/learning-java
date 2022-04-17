package Section06.WallArea;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WallTest {
    @Test
    public void testGetAreaOfSquare() {
        Wall square = new Wall(34, 34);
        assertEquals(1156, square.getArea(), 0.1);
    }

    @Test
    public void testGetAreaOfRectangle() {
        Wall rectangle = new Wall(20, 5);
        assertEquals(100, rectangle.getArea(), 0.1);
    }

    @Test
    public void testGetAreaOfNegativeHeight() {
        Wall rectangle = new Wall(20, -5);
        assertEquals(0, rectangle.getArea(), 0.1);
    }
}
