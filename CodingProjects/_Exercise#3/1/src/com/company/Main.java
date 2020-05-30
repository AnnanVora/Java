package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        getPi();
    }

    public static void getPi() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter accuracy ");
        boolean hasNextInt = scanner.hasNextInt();
        double end = scanner.nextDouble();
        scanner.close();
        double summation = 0.0;

        if (hasNextInt && end > 0) {

            for (int n = 0; n != end; n++) {

                summation += (Math.pow((-1), n)) / (2 * n + 1);
            }
            double pi = 4 * summation;
            System.out.println(pi);
        }
    }
}
