package Section04.EqualSumChecker;

public class EqualSumChecker {
    public static boolean hasEqualSum(int valueA, int ValueB, int sumOfAAndB) {

        if (valueA + ValueB == sumOfAAndB) {
            return true;
        }
        return false;
    }
}