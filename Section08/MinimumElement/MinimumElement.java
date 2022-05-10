package Section08.MinimumElement;

import java.util.Scanner;

public class MinimumElement {
    // for exercise 42 all method should be private
    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        scanner.close();
        return numberOfElements;
    }

    public static int[] readElements(int numberOfElements) {
        Scanner scanner = new Scanner(System.in);
        int[] integers = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            integers[i] = scanner.nextInt();
        }
        scanner.close();
        return integers;
    }

    public static int findMin(int[] integers) {
        int lowestInteger = integers[0];
        for (int i = 1; i < integers.length; i++) {
            if (integers[i] < lowestInteger) {
                lowestInteger = integers[i];
            }
        }
        return lowestInteger;
    }
}
