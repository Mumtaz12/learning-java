package Section05.WhileDoWhileStatement;

public class WhileDoWhileStatement {
    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void printAllEvenNumbers(int startNumber, int endNumber) {
        System.out.println("Let's start the Even Number Printer");

        int loopNumber = startNumber;
        int evenNumberCount = 0;
        while (loopNumber < endNumber) {
            loopNumber++;
            if (!isEvenNumber(loopNumber)) {
                continue;
            }
            System.out.println("Even Number " + loopNumber);
            evenNumberCount++;
            if (evenNumberCount == 5) {
                System.out.println("Even numbers is "+ evenNumberCount);
                break;
            }
        }
    }
}
