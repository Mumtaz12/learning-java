package Section05.NumberPalindrome;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberPalindromeTest {
    @Test
    public void testCorrectPalindrome() {
        boolean result = NumberPalindrome.isPalindrome(101);
        assertEquals(true, result);
    }
    @Test
    public void testFalsePalindrome() {
        boolean result = NumberPalindrome.isPalindrome(12345);
        assertEquals(false, result);
    }
    @Test
    public void testFalsePalindrome222() {
        boolean result = NumberPalindrome.isPalindrome(-222);
        assertEquals(true, result);
    }
}
