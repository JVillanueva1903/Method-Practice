package com.pluralsight;

public class Main {

    // b. Create the method
    public static <String> java.lang.String formatName(String first, String last) {
        return last + ", " + first;   // a. Return "Last, First"
    }

    public static void main(String[] args) {

        // c. Call it inside println()
        java.lang.Object system = null;
        system.out.println(formatName("Bob", "Smith"));

        // BONUS: store the return value in a variable
        java.lang.String formatted = formatName("Alice", "Johnson");
        java.lang.Object syatem = null;
        syatem.out.println(formatted);
    }

    private static class String {
    }
}