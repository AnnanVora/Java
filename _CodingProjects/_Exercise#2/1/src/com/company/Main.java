package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        getFactorial();
    }

    public static void getFactorial() {

        Scanner scanner = new Scanner(System.in);

        long number = 0;
        while (true) {
            long factorial = 1;
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

                for (long i = number; i >= 1; --i) {

                    if (((double) factorial * i) > Long.MAX_VALUE) {
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
