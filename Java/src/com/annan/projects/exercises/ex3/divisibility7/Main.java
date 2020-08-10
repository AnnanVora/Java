package com.annan.projects.exercises.ex3.divisibility7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        isDivisible7();
    }

    public static void isDivisible7() {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter number to evaluate");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {

                int number = scanner.nextInt();

                if (number < 0) {
                    System.out.println("Invalid Value");
                    continue;
                }

                while (number > 70) {

                    int lastDigit = number % 10;
                    number = (number / 10) + (5 * lastDigit);
                }

                if (number % 7 == 0) {
                    System.out.println("Yes, it is divisible by 7");
                } else {
                    System.out.println("No, it is not divisible by seven");
                }
            } else {
                System.out.println("Invalid Value, Bye Bye");
                break;
            }
        }
    }
}
