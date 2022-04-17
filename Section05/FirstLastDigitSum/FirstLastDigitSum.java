package Section05.FirstLastDigitSum;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;

        String numberString = Integer.toString(number);
        int firstDigit = Character.getNumericValue(numberString.charAt(0));

        return (firstDigit + lastDigit);
    }
}
