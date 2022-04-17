package Section04.TeenNumberChecker;

public class TeenNumberChecker {
    public static boolean hasTeen(int valueA, int valueB, int valueC) {
        if (isTeen(valueA) || isTeen(valueB) || isTeen(valueC)) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int value) {
        if (value >= 13 && value <= 19) {
            return true;
        }
        return false;
    }
}
