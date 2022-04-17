package Section05.WhileDoWhileStatement;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WhileDoWhileStatementTest {
    @Test
    public void testEvenNumber() {
        assertEquals(true, WhileDoWhileStatement.isEvenNumber(2));
    }

    @Test
    public void testOddNumber() {
        assertEquals(false, WhileDoWhileStatement.isEvenNumber(3));
    }

    @Test
    public void testSomeNumbersIfEven() {
        WhileDoWhileStatement.printAllEvenNumbers(4, 20);
    }
}
