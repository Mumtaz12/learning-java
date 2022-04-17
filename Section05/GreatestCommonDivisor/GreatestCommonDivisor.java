package Section05.GreatestCommonDivisor;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int numberA, int numberB) {

        if (numberA < 10 || numberB < 10) {
            return -1;
        }

        int lowestNumber = (numberA <= numberB) ? numberA : numberB;

        for (int divisor = lowestNumber; divisor > 1; divisor--) {
            if (numberA % divisor == 0 && numberB % divisor == 0) {
                return divisor;
            }
        }
        return 1;
    }
}
