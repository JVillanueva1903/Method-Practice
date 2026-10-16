public class Main {

    // b. Create this method: isEven(int number)
    // a. returns true if even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // c. Create: isPositive(double number)
    // a. returns true if > 0
    public static boolean isPositive(double number) {
        return number > 0;
    }

    // a. Create a main() method
    public static <String> void main(String[] args) {

        // d. Call these within System.out.println()
        com.pluralsight.Main.System.out.println(isEven(5));     // false
        System.out.println(isEven(4));     // true

        System.out.println(isPositive(3.14));  // true
        System.out.println(isPositive(-2.5));  // false
    }