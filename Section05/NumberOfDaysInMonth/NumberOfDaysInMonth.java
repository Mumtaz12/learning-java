package Section05.NumberOfDaysInMonth;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return -1;
        }
        int numberOfDaysInMonth;
        switch (month) {
            case 1:
                numberOfDaysInMonth = 31;
                break;
            case 2:
                if (isLeapYear(year)) {
                    numberOfDaysInMonth = 29;
                } else {
                    numberOfDaysInMonth = 28;
                }
                break;
            case 3:
                numberOfDaysInMonth = 31;
                break;
            case 4:
                numberOfDaysInMonth = 30;
                break;
            case 5:
                numberOfDaysInMonth = 31;
                break;
            case 6:
                numberOfDaysInMonth = 30;
                break;
            case 7:
                numberOfDaysInMonth = 31;
                break;
            case 8:
                numberOfDaysInMonth = 31;
                break;
            case 9:
                numberOfDaysInMonth = 30;
                break;
            case 10:
                numberOfDaysInMonth = 31;
                break;
            case 11:
                numberOfDaysInMonth = 30;
                break;
            case 12:
                numberOfDaysInMonth = 31;
                break;
            default:
                numberOfDaysInMonth = -1;
                break;
        }
        return numberOfDaysInMonth;

    }
}
