public class SecondAndMinutes {

    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid data for seconds(" + seconds + "), must be a positive integer value";
        }

        int minutes = seconds / 60;
        int remainingSecond = seconds % 60;// here we are finding the remaining seconds by dividing it to 60 seconds witch is 1 min, this is how we find the remaining as seconds
//        int remainingMinutes = minutes % 60;
//        int hours = minutes / 60;

        return getDurationString(minutes, remainingSecond);
//        return hours + "h " + remainingMinutes + "m " + remainingSecond + "s";
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Invalid data for minutes(" + minutes + "), must be a positive integer value";
        }
        if (seconds <= 0 || seconds >= 59) {
            return "Invalid data for seconds(" + seconds + "), must be between 0 and 59";
        }

//        int remainingSecond = seconds % 60;
        int remainingMinutes = minutes % 60;
        int hours = minutes / 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}
