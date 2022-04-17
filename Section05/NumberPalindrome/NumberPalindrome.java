package Section05.NumberPalindrome;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {

        int absNumber = Math.abs(number);

        int reverse = 0;
        int reverseNumber = absNumber;
        while (reverseNumber > 0) {
            reverse += reverseNumber % 10;
            reverse *= 10;
            reverseNumber /= 10;
            System.out.println(reverseNumber);
        }
        reverse /= 10;
        System.out.println(number + " " + reverse);

        if (absNumber == reverse) {
            return true;
        } else {
            return false;
        }

        // String numberString = Integer.toString(Math.abs(number));
        // String reverseString = "";
        // for (int i = numberString.length() - 1; i >= 0; i--) {
        // reverseString += numberString.charAt(i);
        // }
        // int reverse = Integer.parseInt(reverseString);
        // if (Math.abs(number) == reverse) {
        // return true;
        // } else {
        // return false;
        // }


        // other version, but it's in C writen:
        // int l = 0;
        // int h = strlen(str) - 1;

        // // Keep comparing characters while they are same
        // while (h > l)
        // {
        // if (str[l++] != str[h--])
        // {
        // printf("%s is not a palindrome\n", str);
        // return;
        // }
        // }
        // printf("%s is a palindrome\n", str);

    }
}
