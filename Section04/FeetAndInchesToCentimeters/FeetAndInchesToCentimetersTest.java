package Section04.FeetAndInchesToCentimeters;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FeetAndInchesToCentimetersTest {
    @Test
    public void testFeetLowerThenZeroFails() {
        assertEquals(-1, FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(-1, 0), 0.01);
    }
    @Test
    public void testInchesLowerThenZeroFails() {
        assertEquals(-1, FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(1, -1), 0.01);
    }
    @Test
    public void testFeetHigherThenTwelveFails() {
        assertEquals(-1, FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(1, 13), 0.01);
    }
    @Test
    public void testValidInputFeetAndInchesSuccesful() {

        assertEquals(86.36, FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(2, 10), 0.01);
    }

    @Test
    public void testValidInputFeetAndZeroInchesSuccesful() {

        assertEquals(60.96, FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(2, 0), 0.01);
    }
    @Test
    public void testValidInputInchesSuccesful() {

        assertEquals(254, FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(100), 0.01);
    }

}
