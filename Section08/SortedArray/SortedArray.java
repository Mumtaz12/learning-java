package Section08.SortedArray;

import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);
        int[] integers = new int[number];

        for (int i = 0; i < integers.length; i++) {
            integers[i] = scanner.nextInt();
        }
        scanner.close();
        return integers;
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = Arrays.copyOf(array, array.length);
//        Arrays.sort(sortedArray);
//
//        for (int i = 0; i < sortedArray.length / 2; i++) {
//            int temp = sortedArray[i];
//            sortedArray[i] = sortedArray[sortedArray.length - 1 - i];
//            sortedArray[sortedArray.length - 1 - i] = temp;
//        }


        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }


        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;

            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void printArray(int[] integers) {
        for (int i = 0; i < integers.length; i++) {
            System.out.println("Element " + i + " contents " + integers[i]);
        }
    }
}
