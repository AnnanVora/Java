package com.annan.projects.exercises.ex1.fibonacci;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        getFibonacci();
    }

    public static void getFibonacci() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many Fibonacci numbers do you want me to print? ");

        boolean hasNextInt = scanner.hasNextInt();
        int numberOfNumbers = scanner.nextInt();
        scanner.close();

        int previousFibonacci = 0;
        int printingFibonacci = 1;
        int originalFibonacci = printingFibonacci;

        if (hasNextInt) {
            if (numberOfNumbers == 0) {
                System.out.println();
            } else if (numberOfNumbers == 1) {
                System.out.println("1");
            } else if (numberOfNumbers == 2) {
                System.out.println("1");
                System.out.println("1");
            } else if (numberOfNumbers >= 3) {
                if (hasNextInt) {

                    System.out.println("1");
                    for (int i = 1; i < numberOfNumbers; i++) {

                        printingFibonacci += previousFibonacci;
                        System.out.println(printingFibonacci);
                        previousFibonacci = originalFibonacci;
                        originalFibonacci = printingFibonacci;
                    }
                } else {
                    System.out.println("Invalid Value");
                }
            }
        } else {
            System.out.println("Invalid Value");
        }

    }
}
