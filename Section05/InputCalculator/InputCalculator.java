package Section05.InputCalculator;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;

        while (true) {

            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                counter++;
                sum += scanner.nextInt();

            } else {
                break;
            }
            scanner.nextLine();
        }

        long average = Math.round((double)sum / counter);
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();

    }
}
