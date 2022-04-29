package Section06.ComplexOperations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexNumberTest {
    @Test
    public void testAddRealAndImaginaryNumber() {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        one.add(1, 1);
        assertEquals(2.0, one.getReal(), 0.1);
        assertEquals(2.0, one.getImaginary(), 0.1);
    }

    @Test
    public void testSubtractRealAndImaginaryFromNumber() {
        ComplexNumber one = new ComplexNumber(2.0, 2.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.subtract(number);
        assertEquals(-0.5, one.getReal(), 0.1);
        assertEquals(3.5, one.getImaginary(), 0.1);
    }

    @Test
    public void testSubtractRealAndImaginaryFromOne() {
        ComplexNumber one = new ComplexNumber(-0.5, 3.5);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        number.subtract(one);
        assertEquals(3.0, number.getReal(), 0.1);
        assertEquals(-5.0, number.getImaginary(), 0.1);
    }
}
