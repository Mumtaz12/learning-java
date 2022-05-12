package Section08.MinimumElementChallange;

import java.util.Scanner;

public class MinimumElement {
    public static int[] readIntegers(int count) {
        Scanner scanner = new Scanner(System.in);

        int[] integers = new int[count];
        for (int i = 0; i < count; i++) {
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
