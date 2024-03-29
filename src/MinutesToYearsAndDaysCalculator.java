public class MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

//    public static final int INVALID_VALUE = -1;
//
//    public static String printYearsAndDays(long minutes) {
//        if (minutes < 0) {
//            return "INVALID_VALUE";
//        }
//
//        long hour = minutes / 60;
//        long day = hour / 24;
//        long year = day / 365;
//        long remainingDays = day % 365;
//
//        return minutes + "min = " + year + " y" + " and " + remainingDays + " d";
//    }

    public static final int MIN_PER_HOUR = 60;
    public static final int HOURS_PER_DAY = 24;
    public static final int DAYS_PER_YEAR = 365;
    public static final int MIN_PER_DAY = MIN_PER_HOUR * HOURS_PER_DAY;
    public static final int MIN_PER_YEAR = MIN_PER_HOUR * HOURS_PER_DAY * DAYS_PER_YEAR ;

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long years = minutes / MIN_PER_YEAR;
        long days = (minutes / MIN_PER_DAY) % DAYS_PER_YEAR;

        System.out.println(minutes + " min = " + years  + " y and " + days + " d");
    }
}
