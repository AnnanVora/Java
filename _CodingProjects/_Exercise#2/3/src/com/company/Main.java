package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start year");
        int count = 0;
        boolean first = true;

        boolean hasNextInt = scanner.hasNextInt();
        int startYear = scanner.nextInt();
        scanner.close();

        if (hasNextInt && startYear > 0) {

            for (int i = startYear + 1; count < 20; ++i, ++count) {

                if (isLeapYear(i)) {

                    if (!first) {
                        System.out.print(", ");
                    } else {
                        first = false;
                    }
                    System.out.print(i);
                }
            }
        }
    }

    public static boolean isLeapYear(int year) {

        return year > 1 && ((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0;
    }
}
