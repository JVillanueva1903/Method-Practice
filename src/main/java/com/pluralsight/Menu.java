package com.pluralsight;

public class Main {

    private static java.lang.Object System;
    private static java.lang.Object[] args;

    // b. Create a method called displayMenu()
    static void displayMenu() {
        System.out.println("=== MENU ===");
        System.out.println("1. Coffee - $3.99");
        System.out.println("2. Tea - $2.99");
        System.out.println("3. Cookie - $1.99");
        System.out.println(); // just adds a blank line for readability
    }

    // a. Create main() method
    public static <String> void main(String[] args) {
        Main.args = args;

        // c. Call displayMenu() twice
        displayMenu();
        displayMenu();
    }
}