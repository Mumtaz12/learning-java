package Section05.NumberInWord;

public class NumberInWord {
    public static void printNumberInWord(int number) {
        String numberAsWord;
        switch (number) {
            case 0:
                numberAsWord = "zero";
                break;
            case 1:
                numberAsWord = "one";
                break;
            case 2:
                numberAsWord = "two";
                break;
            case 3:
                numberAsWord = "three";
                break;
            case 4:
                numberAsWord = "four";
                break;
            case 5:
                numberAsWord = "five";
                break;
            case 6:
                numberAsWord = "six";
                break;
            case 7:
                numberAsWord = "seven";
                break;
            case 8:
                numberAsWord = "eight";
                break;
            case 9:
                numberAsWord = "nine";
                break;
            default:
                numberAsWord = "other";
                break;
        }
        System.out.println(numberAsWord.toUpperCase());
    }
}
