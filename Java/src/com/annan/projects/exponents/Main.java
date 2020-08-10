package com.annan.projects.exponents;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 31; i++) {
            System.out.println(i + " square = " + getPower(i, 2));
        }
    }

    public static long getPower(int number, int power) {

        int originalNumber = number;
        long poweredNumber = 0;
        for (int i = 1; i != power; i++) {
            poweredNumber = number * originalNumber;
            number *= originalNumber;
        }

        return poweredNumber;
    }
}

