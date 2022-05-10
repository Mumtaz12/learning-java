package Section08.MinimumElementChallange;

import static Section08.MinimumElementChallange.MinimumElement.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] integers = readIntegers(5);
        System.out.println(Arrays.toString(integers));

        System.out.println(findMin(integers));
    }
}
