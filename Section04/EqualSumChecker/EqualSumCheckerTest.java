package Section04.EqualSumChecker;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EqualSumCheckerTest {
    @Test
    public void testValueIsEqualToSumOfTwoNumber (){
        assertEquals(true, EqualSumChecker.hasEqualSum(1, 1, 2));
    }
    @Test
    public void testValueIsUnequalToSumOfTwoNumber (){
        assertEquals(false, EqualSumChecker.hasEqualSum(4, 5, 2));
    }
}
