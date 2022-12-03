package Experimenting;

public class LoopIt {
    private int numberOfLoops;

    public LoopIt(int numberOfLoops) {
        this.numberOfLoops = numberOfLoops;
    }

    public void printLoop(String text) {
        for (int i = 0; i < numberOfLoops; i++) {
            System.out.println("The text is " + text);
        }
    }
}
