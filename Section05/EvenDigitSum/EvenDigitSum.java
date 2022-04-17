package Section05.EvenDigitSum;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        // if even
        int sumOfEvenDigits = 0;

        while (number > 0) {
            if (number % 2 == 0) {
                int evenDigit = number % 10;
                number -= evenDigit;
                number /= 10;
                sumOfEvenDigits += evenDigit;
            } else {
                number /= 10;
            }
        }
        return sumOfEvenDigits;
    }
}
