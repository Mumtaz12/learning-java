package Section05.LargestPrime;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }
        return number;

    }
}
