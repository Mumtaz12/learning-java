package Section04.IntEqualityPrinter;

public class IntEqualityPrinter {
    public static void printEqual(int valueA, int valueB, int valueC) {
        if (valueA < 0 || valueB < 0 || valueC < 0) {
            System.out.println("Invalid Value");
        } else {
            if (valueA == valueB && valueB == valueC) {
                System.out.println("All numbers are equal");
            } else if (valueA != valueB && valueB != valueC && valueA != valueC) {
                System.out.println("All numbers are different");
            } else {
                System.out.println("Neither all are equal or different");
            }
        }
    }
}
