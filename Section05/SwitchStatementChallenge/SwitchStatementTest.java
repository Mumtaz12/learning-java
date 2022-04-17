package Section05.SwitchStatementChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SwitchStatementTest {
    @Test
    public void testChooseLetterA() {
        String result = SwitchStatement.getSelectedLetter('A');
        System.out.println(result);
        assertEquals("You choose letter A.", result);
    }

    @Test
    public void testChooseLetterB() {
        String result = SwitchStatement.getSelectedLetter('B');
        System.out.println(result);
        assertEquals("You choose letter B.", result);
    }

    @Test
    public void testChooseLetterC() {
        String result = SwitchStatement.getSelectedLetter('C');
        System.out.println(result);
        assertEquals("You choose letter C.", result);
    }

    @Test
    public void testChooseLetterD() {
        String result = SwitchStatement.getSelectedLetter('D');
        System.out.println(result);
        assertEquals("You choose letter D.", result);
    }

    @Test
    public void testChooseLetterE() {
        String result = SwitchStatement.getSelectedLetter('E');
        System.out.println(result);
        assertEquals("You choose letter E.", result);
    }

    @Test
    public void testChooseLetterF() {
        String result = SwitchStatement.getSelectedLetter('F');
        System.out.println(result);
        assertEquals("You choose letter that isn't an option.", result);
    }
}
