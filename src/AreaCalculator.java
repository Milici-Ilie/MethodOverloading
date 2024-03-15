public class AreaCalculator {

    public static void main(String[] args) {

        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    public static final int INVALID_VALUE = -1;

    public static double area(double radius) {
        if (radius < 0) {
            return INVALID_VALUE;
        }
        double areaCircle = radius * radius * Math.PI;

        return areaCircle;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return INVALID_VALUE;
        }
        double sides = x * y;

        return sides;
    }
}
