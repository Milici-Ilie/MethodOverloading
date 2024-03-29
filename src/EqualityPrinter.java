public class EqualityPrinter {

    public static void main(String[] args) {
        printEqual(1, 1, 1);
    }

    public static void printEqual(int x, int y, int z) {

        if (x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid Value");
        } else if (x == z && z == y && x == y) {
            System.out.println("All numbers are equal");
        } else if (x != z && z != y && x != y) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different!");
        }
    }
}
