package Section05.SharedDigit;

public class SharedDigit {
    public static boolean hasSharedDigit(int numberA, int numberB) {

        if (numberA < 10 || numberA > 99 || numberB < 10 || numberB > 99) {
            return false;
        }

        int numberAUnits = numberA % 10;
        int numberATens = numberA / 10;

        int numberBUnits = numberB % 10;
        int numberBTens = numberB / 10;

        if (numberAUnits == numberBUnits || numberAUnits == numberBTens) {
            return true;
        }
        if (numberATens == numberBUnits || numberATens == numberBTens) {
            return true;
        }
        return false;
    }
}
