package Section04.DecimalComparator;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double decimalA, double decimalB) {
        double decimalARounded = (int) (decimalA * 1000) / 1000d;
        double decimalBRounded = (int) (decimalB * 1000) / 1000d;
        if (decimalARounded == decimalBRounded){
            return true;
        }
        return false;
    }
}
