package Section04.AreaCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AreaCalculatorTest {
    @Test
    public void testAreaOfCircle() {
        assertEquals(50.26548245743669, AreaCalculator.area(4),0.0001);
    }
    @Test
    public void testAreaOfCircleWithNegativeRadius() {
        assertEquals(-1, AreaCalculator.area(-33),0.0001);
    }

    @Test
    public void testAreaOfRectangle() {
        assertEquals(40.0, AreaCalculator.area(10.0,4.0),0.0001);
    }
    @Test
    public void testAreaOfRectangleWithNegativeParameter() {
        assertEquals(-1, AreaCalculator.area(-10.0,4.0),0.0001);
    }
}
