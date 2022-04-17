package Section05.SwitchStatementChallenge;

public class SwitchStatement {
    private static final String WHICH_LETTER_MESSAGE = "You choose letter ";

    public static String getSelectedLetter(char letter) {

        String return_string = WHICH_LETTER_MESSAGE;
        switch (letter) {
            case 'A':
                return_string += letter;
                break;
            case 'B':
                return_string += letter;
                break;
            case 'C': case 'D': case 'E':
                return_string += letter;
                break;
            default:
                return_string += "that isn't an option";
                break;
        }
        return return_string + ".";

    }
}
