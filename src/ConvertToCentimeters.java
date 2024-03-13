public class ConvertToCentimeters {

    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");

        System.out.println("68in = " + convertToCentimeters(68) + "cm");
//        System.out.println(convertToCentimeters());
    }

    public static double convertToCentimeters(int inches) {
//        double result = inches * 2.54; ... much simpler down in the "return"
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feetHeight, int remainingInches) {
//        int foot = feetHeight * 12;
//        int result = foot + remainingInches;
//          double finalResult = convertToCentimeters(result);
//        return convertToCentimeters(finalResult); // much simpler down in the "return"

//        return ((feetHeight * 12) + remainingInches) * 2.54;

        return convertToCentimeters((feetHeight * 12) + remainingInches);// here we are calling the first method ... here we are passing an entire ecuation to the 'inches' from the first method
    }
}
