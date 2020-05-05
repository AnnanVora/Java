package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        getSecondHighest();
    }

    private static void getSecondHighest() {

        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter number");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {

                int number = scanner.nextInt();

                if (number > max) {
                    secondMax = max;
                    max = number;
                } else if (number <= max && number > secondMax) {
                    secondMax = number;
                }

                System.out.print("Highest: " + max);
                if (secondMax == Integer.MIN_VALUE) {
                    System.out.println(", Second Highest: undefined");
                } else {
                    System.out.println(", Second Highest: " + secondMax);
                }
            } else {
                break;
            }

            scanner.nextLine();
        }
        System.out.print("Highest: " + max);
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println(", Second Highest: undefined");
        } else {
            System.out.println(", Second Highest: " + secondMax);
        }
    }
}
