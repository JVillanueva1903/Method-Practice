package com.pluralsight;

public class Main {

    private static java.lang.Object System;

    public static <String> void main(String[] args) {
        sayHello();
        sayGoodbye();
        sayGoodMorning();
    }

    static void sayHello() {
        System.out.println("Hello, World!");
    }

    static void sayGoodbye() {
        System.out.println("Goodbye!");
    }

    static void sayGoodMorning() {
        System.out.println("Good morning!");
    }
}