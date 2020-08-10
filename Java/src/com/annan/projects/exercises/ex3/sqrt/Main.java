package com.annan.projects.exercises.ex3.sqrt;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        divideLongMethod();
    }

    public static void divideLongMethod() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter divisor");
        boolean isInt = scanner.hasNextInt();
        int divisor = scanner.nextInt();
        System.out.println("Enter dividend");
        boolean hasInt = scanner.hasNextInt();
        int dividend = scanner.nextInt();
        scanner.close();
        int quotient = 0;

        if (!isInt || !hasInt) {
            System.out.println("Invalid value");
        }

        int numDigits = getDigitCount(dividend);
        int currentDividend = getDigit(dividend, numDigits - 1);

        for (int i = 0; i < numDigits; i++) {
            int currentDigitIndex = numDigits - i - 1;
            int quotientDigit = checkGreatestMultiplier(divisor, currentDividend);
            quotient = quotient * 10 + quotientDigit;

            int dividendDigit = getDigit(dividend, currentDigitIndex);
            dividendDigit -= quotientDigit * divisor;
            currentDividend = dividendDigit * 10 + getDigit(dividend, currentDigitIndex - 1);
        }
        System.out.println("Quotient: " + quotient);
    }

    public static int checkGreatestMultiplier(int toMultiply, int lessThanEqualTo) {

        int number = 0;
        for (int i = 1; i <= lessThanEqualTo; i++) {

            if (i * toMultiply <= lessThanEqualTo) {
                number = i;
            } else
                break;
        }
        return number;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int count = 0;
        if (number > 0) {
            while (number != 0) {
                number /= 10;
                count++;
            }
        } else {
            count = 1;
        }
        return count;
    }

    public static int getDigit(int number, int index) {
        number /= Math.pow(10, index);
        return number % 10;

    }
}
