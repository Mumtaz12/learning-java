package Section05.MinAndMaxChallenge;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void printMinAndMaxInput() {
        Scanner scanner = new Scanner(System.in);
        int highestNumber = Integer.MIN_VALUE;
        int lowestNumber = Integer.MAX_VALUE;

        while (true) {
            System.out.println("Insert a number:");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();

                if (number < lowestNumber) {
                    lowestNumber = number;
                }
                if (number > highestNumber) {
                    highestNumber = number;
                }

            } else {
                System.out.println("Oh no! Now you done it!");
                break;
            }
            scanner.nextLine();

        }

        System.out.println("The lowest number is " + lowestNumber + " en the highest number is " + highestNumber);
        scanner.close();
    }
}
