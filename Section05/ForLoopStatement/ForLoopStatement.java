package Section05.ForLoopStatement;

import java.util.Locale;

public class ForLoopStatement {

    public static void calculateAllInterest(int number) {
        for (int i = number; i >= 2; i--) {
            System.out.println(String.format(Locale.US, "%.2f", calculateInterest(10000.0, (double) i)));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static void getFirstThreePrimeNumbers(int number, int startNumber) {
        int counter = 0;
        for (int i = startNumber; i <= number; i++) {
            if (isPrime(i)) {
                System.out.print(i + ", ");
                counter++;
                if (counter >= 3) {
                    break;
                }
            }
        }
        System.out.println("Found " + counter + " prime number(s).");
    }

    private static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
