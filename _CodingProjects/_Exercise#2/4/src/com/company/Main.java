package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int diff;

        while (true) {

            System.out.println("Enter number to printout");
            boolean hasNextInt = scanner.hasNextInt();
            boolean flag = true;

            if (hasNextInt) {

                int number = scanner.nextInt();
                diff = getDigitCount(number) - getDigitCount(reverse(number));
                number = reverse(number);

                while (number != 0) {

                    if (flag) {
                        System.out.print(number % 10);
                    } else {
                        System.out.print(", " + number % 10);
                    }
                    number /= 10;
                    flag = false;
                }

                for (; diff > 0; diff--) {
                    System.out.print(", 0");
                }
                System.out.println();
            } else {
                System.out.println("Invalid value");
                break;
            }
        }
    }

    public static int reverse(int numberToReverse) {

        int originalNumber = numberToReverse;
        if (numberToReverse < 0) {
            numberToReverse = -numberToReverse;
        }

        int reverse = 0;
        while (numberToReverse > 0) {
            int lastDigit = numberToReverse % 10;
            reverse *= 10;
            reverse += lastDigit;
            numberToReverse /= 10;
        }
        if (originalNumber > 0) {
            return reverse;
        } else {
            return -reverse;
        }
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int count = 0;
        if (number > 0 ) {
            while (number != 0) {
                number /= 10;
                count++;
            }
        } else {
            count = 1;
        }
        return count;
    }
}
