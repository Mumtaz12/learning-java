package Experimenting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char row = 'A';
        System.out.println(row + String.format("%02d", 1));


        Scanner scanner = new Scanner(System.in);
        String specialText = scanner.nextLine();
        LoopIt loopIt = new LoopIt(5);
        loopIt.printLoop(specialText);
    }
}


