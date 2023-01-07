public class DateUtil {
    public static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        }
        if (year % 100 != 0) {
            return true;
        }
        if (year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        if (month == 2) {
            if (isLeapYear(year)) {
                if (day > 0 && day <= daysInMonths[month - 1] + 1) {
                    return true;
                }
                return false;
            }
            if (day > 0 && day <= daysInMonths[month - 1]) {
                return true;
            }
            return false;
        }
        if (day > 0 && day <= daysInMonths[month - 1]) {
            return true;
        }
        return false;
    }

    private static int[] firstNumberValue = {6, 4, 2, 0};
    private static int[] nonLeapYearValue = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    private static int[] leapYearValue = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

    public static int getDayOfWeek(int year, int month, int day) {
        int firstTwoDigits = year / 100;
        int lastTwoDigits = year % 100;
        int dayOfWeek = firstNumberValue[firstTwoDigits % 4] + lastTwoDigits + lastTwoDigits / 4;
        dayOfWeek += isLeapYear(year) ? leapYearValue[month - 1] : nonLeapYearValue[month - 1];
        dayOfWeek += day;
        return dayOfWeek % 7;
    }

    private static String[] strDayOfWeek = {"Sun", "Mon", "Tues", "Wednes", "Thurs", "Fri", "Satur"};

    public static String toString(int year, int month, int day) {
        return strDayOfWeek[getDayOfWeek(year, month, day)] + "day " + day + " " + strMonths[month - 1] + " " + year;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2011));
        System.out.println(isLeapYear(2012));

        System.out.println(isValidDate(2012, 2, 29));
        System.out.println(isValidDate(2011, 2, 29));
        System.out.println(isValidDate(2099, 12, 31));
        System.out.println(isValidDate(2099, 12, 32));

        System.out.println(getDayOfWeek(1982, 4, 24));
        System.out.println(getDayOfWeek(2000, 1, 1));
        System.out.println(getDayOfWeek(2054, 6, 19));
        System.out.println(getDayOfWeek(2012, 2, 17));

        System.out.println(toString(2012, 2, 14));
    }
}
