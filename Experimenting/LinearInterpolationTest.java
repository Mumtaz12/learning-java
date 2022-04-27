package Experimenting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinearInterpolationTest {
    @Test
    public void test() {
        LinearInterpolation value = new LinearInterpolation(0,0,2,2);
        double result = value.getY(1);
        assertEquals(1.0, result, 0.001);
    }
}