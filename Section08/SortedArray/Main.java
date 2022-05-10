package Section08.SortedArray;

import static Section08.SortedArray.SortedArray.*;

public class Main {
    public static void main(String[] args) {
        int[] unsortedArray = getIntegers(5);
        int[] sortedArray = sortIntegers(unsortedArray);
        printArray(sortedArray);
    }
}
