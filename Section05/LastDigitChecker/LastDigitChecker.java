package Section05.LastDigitChecker;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int numberA, int numberB, int numberC) {

        if (!(isValid(numberA) && isValid(numberA) && isValid(numberA))) {
            return false;
        }

        int numberAUnits = numberA % 10;
        int numberBUnits = numberB % 10;
        int numberCUnits = numberC % 10;

        if (numberAUnits == numberBUnits || numberAUnits == numberCUnits || numberBUnits == numberCUnits) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        }
        return false;
    }

    // ----------------------------------------------------------------------------------------------------------
    // ----------------------------------------------------------------------------------------------------------
    public static boolean hasSameLastDigitShorterMethod(int numberA, int numberB, int numberC) {

        if (isValid(numberA) && isValid(numberA) && isValid(numberA)) {

            int numberAUnits = numberA % 10;
            int numberBUnits = numberB % 10;
            int numberCUnits = numberC % 10;

            return (numberAUnits == numberBUnits || numberAUnits == numberCUnits || numberBUnits == numberCUnits);
        }
        return false;
    }

    public static boolean isValidShorterMethod(int number) {
        return (number >= 10 && number <= 1000);
    }
    // ----------------------------------------------------------------------------------------------------------
    // ----------------------------------------------------------------------------------------------------------

}
