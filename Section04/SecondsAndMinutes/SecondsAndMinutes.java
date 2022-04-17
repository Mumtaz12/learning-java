package Section04.SecondsAndMinutes;

public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hoursFormated = longToStringAndLowerThenTenAddLeadingZero(hours);
        String minutesFormated = longToStringAndLowerThenTenAddLeadingZero(remainingMinutes);
        String secondsFormated = longToStringAndLowerThenTenAddLeadingZero(seconds);

        return hoursFormated + "h " + minutesFormated + "m " + secondsFormated + "s";
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;
        seconds %= 60;

        return getDurationString(minutes, seconds);
    }

    private static String longToStringAndLowerThenTenAddLeadingZero(long value) {
        if (value < 10) {
            return "0" + Long.toString(value);
        }
        return Long.toString(value);
    }

}
