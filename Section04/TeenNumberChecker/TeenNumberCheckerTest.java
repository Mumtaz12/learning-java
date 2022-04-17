package Section04.TeenNumberChecker;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TeenNumberCheckerTest {
    @Test
    public void hasNoTeen() {
        assertEquals(false, TeenNumberChecker.hasTeen(12, 55, 11));
    }

    @Test
    public void hasTeen() {
        assertEquals(true, TeenNumberChecker.hasTeen(9, 15, 20));
    }
}
