package Section08.SortedArray;

public class Main {
    public static void main(String[] args) {
        SortedArray sortArray = new SortedArray();

        int[] unsortedArray = sortArray.getIntegers(5);
        int[] sortedArray = sortArray.sortIntegers(unsortedArray);
        sortArray.printArray(sortedArray);
    }
}
