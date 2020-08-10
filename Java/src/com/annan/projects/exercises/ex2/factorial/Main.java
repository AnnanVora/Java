package com.annan.projects.exercises.ex2.factorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        getFactorial();
    }

    public static void getFactorial() {

        Scanner scanner = new Scanner(System.in);

        double number;
        while (true) {
            double factorial = 1;
            System.out.println("Enter a number");
            boolean hasNext;
            hasNext = scanner.hasNextLong();

            if (hasNext) {

                number = scanner.nextLong();

                if (number < 0) {
                    System.out.println(number + "! = undefined");
                    continue;
                } else if (number == 0) {
                    System.out.println(number + "! = 1");
                    continue;
                }

                boolean isTooLarge = false;

                for (double i = number; i >= 1; --i) {

                    if (factorial * i > Double.MAX_VALUE) {
                        System.out.println(number + "! = Too large");
                        isTooLarge = true;
                        break;
                    } else {
                        factorial *= i;
                    }
                }

                if (isTooLarge) {
                    continue;
                }
            } else {
                break;
            }

            System.out.println(number + "! = " + factorial);
        }

        scanner.close();
    }
}
