package com.annan.projects.armstrong;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        int limit = scanner.nextInt();

        int i = 0;
        System.out.println("The Armstrong numbers from 1 to " + limit + " are ");
        while (i != limit) {
            if (isArmstrong(i) != -1) {
                System.out.println(isArmstrong(i));
            }
            i++;
        }
    }

    public static int isArmstrong(int number) {

        if (number < 10) {
            return -1;
        }

        int originalNumber = number;
        int sum = 0;

        while (number > 0) {

            int digit = number % 10;
            switch (getDigitCount(originalNumber)) {
                case 1:
                case 2:
                    return -1;
                case 3:
                    sum += Math.pow(digit, 3);
                    break;
                case 4:
                    sum += Math.pow(digit, 4);
                    break;
                case 5:
                    sum += Math.pow(digit, 5);
                    break;
                case 6:
                    sum += Math.pow(digit, 6);
                    break;
                case 7:
                    sum += Math.pow(digit, 7);
                    break;
                case 8:
                    sum += Math.pow(digit, 8);
                    break;
                case 9:
                    sum += Math.pow(digit, 9);
                    break;
            }
            number /= 10;
        }

        if (originalNumber == sum) {
            return originalNumber;
        } else {
            return -1;
        }
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
}
