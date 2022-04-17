package Section04.FeetAndInchesToCentimeters;

public class FeetAndInchesToCentimeters {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (isFeetOutOfRange(feet) || areInchesOutOfRange(inches)) {
            return -1;
        }

        double totalInches = inches + (feet * 12);
        double totalCentimeters = totalInches * 2.54;

        return totalCentimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        inches = (int) inches % 12;

        return calcFeetAndInchesToCentimeters(feet, inches);
    }

    public static boolean isFeetOutOfRange(double feet) {
        if (feet >= 0) {
            return false;
        }
        return true;
    }

    public static boolean areInchesOutOfRange(double inches) {
        if (inches >= 0 && inches <= 12) {
            return false;
        }
        return true;
    }
}
