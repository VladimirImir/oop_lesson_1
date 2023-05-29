package com.dev.oop.lesson1;

public class TestExample {

    public static void main(String[] args) {
        int value = 10;
        int[] values = {value, 100, 200, 300};
        printArray(values);
    }

    private static void printArray(int[] values) {
        for (int value : values) {
            System.out.println(value);
        }
    }
}
